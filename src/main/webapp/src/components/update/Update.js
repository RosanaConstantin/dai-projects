import React, { Component } from "react";
import './Update.css'
import {Button} from "react";

class Update extends Component {
  render() {
    return (
    <div className="wrapper">
    <h2>Updateaza-ti baza de date a portalului cu cele mai recente proiecte europene!</h2>
    <span>Tine cont ca acest proces poate dura cateva momente..</span>
   <button
          className="update"
          onClick={this.props.handleClick}>Update</button>
</div>
    );
  }
}

export default Update;
