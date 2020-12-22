import React from "react";
import ReactDOM from "react-dom";
import App from "./App";
import { BrowserRouter, Route, Switch } from "react-router-dom";

ReactDOM.render(
  <React.StrictMode>
    <BrowserRouter basename={process.env.PUBLIC_URL}>
      <Switch>
        <Route exact path="/" component={App}></Route>
      </Switch>
    </BrowserRouter>
  </React.StrictMode>,

  document.getElementById("root")
);
