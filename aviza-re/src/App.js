import React, { Component } from "react";
import LocationListComponent from "./LocationListComponent";
import NavigationComponent from "./NavigationComponent";

export default class App extends Component {
  render() {
    return (
      <div className="container">
        <NavigationComponent />
        <LocationListComponent />
      </div>
    );
  }
}
