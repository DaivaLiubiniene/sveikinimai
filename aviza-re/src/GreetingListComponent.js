import React, { Component } from "react";
import axios from "axios";

export default class GreetingListComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      greetings: [],
    };
    this.refreshGreetings = this.refreshGreetings.bind(this);
  }

  componentDidMount() {
    this.refreshGreetings();
  }

  refreshGreetings() {
    axios.get("http://localhost:8080/greetings/all").then((response) => {
      console.log(response);
      this.setState({ greetings: response.data });
    });
  }
  render() {
    return (
      <div className="container">
        <h3>Greetings</h3>
        <div className="row">
          {this.state.greetings.map((greeting, index) => {
            return (
              <div className="col-6" key={index}>
                <img
                  src={greeting.image}
                  className="card-img-top"
                  alt="pav"
                ></img>
                <div className="card-body">
                  <h5 className="card-title">
                    {" "}
                    {greeting.greeterFirstName} {greeting.greeterLastName}
                  </h5>
                  <p className="card-text"> {greeting.text} </p>
                  <a href="#0" className="btn btn-primary">
                    Look
                  </a>
                </div>
              </div>
            );
          })}
        </div>
      </div>
    );
  }
}
