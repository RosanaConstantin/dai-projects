import React, { Component } from "react";
import logo from '../img/edp.png';
import './App.css';

import { Route, BrowserRouter,Router, Switch, Redirect, Link } from "react-router-dom";
import { RoutedTabs, NavTab } from "react-router-tabs";
import Home from "./home/Home";
import Projects from "./projects/Projects";
import About from "./about/About";
import Project from "./project/Project";
import Update from "./update/Update";

class App extends Component {
  render() {
    const { path } = this.props.match;

    return (

<BrowserRouter>
     <div className="App">
          <header className="App-header">
            <img src={logo} className="App-logo" alt="logo" />

            <p id="title">
            Portal pentru proiectele europene
            </p>

         <div className ="tabs">
           <Link className ="link" to="/home">Acasa</Link>
           <Link className ="link" to="/projects">Proiecte</Link>

           <Link className ="link" to="/update">Actualizare</Link>
            <Link className ="link" to="/about">Despre</Link>


         </div>
          </header>
           <Switch>

                       <Route path="/home" component={Home} />
                       <Route path="/projects" component={Projects} />
                       <Route path="/about" component={About} />
                       <Route path="/project" component={Project} />
                       <Route path="/update" component={Update} />
                     </Switch>
      </div>
      </BrowserRouter>
    );
  }
}

export default App;
