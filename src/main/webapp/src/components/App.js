import React, { Component } from "react";
import logo from '../img/edp.png';
import './App.css';

import { Route, BrowserRouter,Router, Switch, Redirect, Link } from "react-router-dom";
import { RoutedTabs, NavTab } from "react-router-tabs";
import Home from "./home/Home";
import Projects from "./projects/Projects";
import About from "./about/About";

class App extends Component {
  render() {
    const { path } = this.props.match;

    return (

<BrowserRouter>
     <div className="App">
          <header className="App-header">
            <img src={logo} className="App-logo" alt="logo" />

            <p id="title">
            Your portal to European Projects
            </p>

         <div className ="tabs">
           <Link className ="link" to="/home">Home</Link>
           <Link className ="link" to="/projects">Projects</Link>
           <Link className ="link" to="/about">About</Link>


         </div>
          </header>
           <Switch>

                       <Route path="/home" component={Home} />
                       <Route path="/projects" component={Projects} />
                       <Route path="/about" component={About} />
                     </Switch>
      </div>
      </BrowserRouter>
    );
  }
}

export default App;
