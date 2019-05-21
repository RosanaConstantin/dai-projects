import React, { Component } from "react";
import {Redirect} from "react";
import "./Projects.css"
import {Link} from "react-router-dom";
import {Button, View} from "react";

class Projects extends Component {
   state = {
       data: [],
    //   redirect: false,
    //   id: null
     };
//  handleClick = (id) =>{
//        this.setState({redirect: true, id: id});
//  };


        createTable = (items) => {
           let table = []
            //console.log(items);
           // Outer loop to create parent
           for (let i = 0; i < items.length; i++) {
             let children = []
             //Inner loop to create children
             children.push(<td> <Link to={{pathname: "/project", state: { id: items[i].id}}}> {items[i].id} </Link> </td>);
             children.push(<td> {items[i].acronym}</td>);
             children.push(<td>  {items[i].statusName}</td>);
             children.push(<td>  {items[i].programme}</td>);
             children.push(<td>  {items[i].title}</td>);
             children.push(<td>  {items[i].startDate}</td>);
             children.push(<td>  {items[i].endDate}</td>);
             children.push(<td>  {items[i].objective}</td>);
             children.push(<td>  {items[i].totalCost}</td>);

             //Create the parent and add the children
             table.push(<tr >{children}</tr>)
           }
           return table
         }
     componentDidMount() {
    fetch("http://localhost:8081/V1/all", { 'method': 'get', 'headers': { 'Accept': 'application/json',
                                                                                              'Content-Type': 'application/json' } })
      .then(response => response.json())
      .then(data => this.setState({ data: data }));
     }
         // Call our fetch function below once the component mounts
//       this.callBackendAPI()
//         .then(res => this.setState({ data: res.express }))
//         .catch(err => console.log(err));
//     }
//       // Fetches our GET route from the Express server. (Note the route we are fetching matches the GET route from server.js
//     callBackendAPI = async () => {
//       const response = await fetch('http://localhost:8081/V1/all');
//       console.log(JSON.stringify(response));
//       const body = await response.json();
//
//       if (response.status !== 200) {
//         throw Error(body.message)
//       }
//       return body;
//     };

  render() {
  const dataColumns = ["ID", "Acronym", "Status", "Programme", "Title", "Start date", "End Date", "Objective", "Total cost"];

    return (

        <table className='table'>
        <thead className='cap'>
           <tr className="coloana">
              {dataColumns.map(function(column) {
                      return <th>{column}</th>; })}
               </tr>
         </thead>
        <tbody>
           {this.createTable(this.state.data)}
           </tbody>

        </table>

    );
  }
}

export default Projects;
