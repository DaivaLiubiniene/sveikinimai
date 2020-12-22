import React, { Component } from "react";
import axios from "axios";

export default class LocationListComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      locations: [],
    };
    this.refreshLocations = this.refreshLocations.bind(this);
  }

  componentDidMount() {
    this.refreshLocations();
  }

  refreshLocations() {
    axios.get("http://localhost:8080/locations/all").then((response) => {
      console.log(response);
      this.setState({ locations: response.data });
    });
  }

  render() {
    return (
      <div className="container">
        <h3>Locations</h3>
        <div className="container">
          <table className="table">
            <thead>
              <tr>
                <th>Id</th>
                <th>Title</th>
                <th style={{ width: 200 }}>Logo</th>
              </tr>
            </thead>
            <tbody>
              {this.state.locations.map((location) => (
                <tr key={location.id}>
                  <td>{location.id}</td>
                  <td>{location.title}</td>
                  <td>
                    <img
                      className="img-thumbnail"
                      src={location.logo}
                      alt="..."
                    />
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}
