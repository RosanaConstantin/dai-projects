import React, { Component } from "react";
import "./Project.css"

class Project extends Component {

    state= {
        data: {}
    }

   componentDidMount() {
    fetch("http://localhost:8081/V1/project/" + this.props.location.state.id, { 'method': 'get', 'headers': { 'Accept': 'application/json',
                                                                                              'Content-Type': 'application/json' } })
      .then(response => response.json())
      .then(data => this.setState({ data: data }));
     }

  render() {
    return (
    <div className="details">
        <div className="detailsRow">
             <h3>Acronim: </h3> <p className="detailsP">{this.state.data.acronym}</p>
        </div>
              <div className="detailsRow">
                    <h3>Status: </h3> <p className="detailsP">{this.state.data.statusName}</p>
               </div>
               <div className="detailsRow">
                     <h3>Program: </h3> <p className="detailsP">{this.state.data.programme}</p>
                </div>
               <div className="detailsRow">
                     <h3>Titlu: </h3> <p className="detailsP">{this.state.data.title}</p>
                </div>
     <div className="detailsRow">
                         <h3>Data de inceput: </h3> <p className="detailsP">{this.state.data.startDate}</p>
                    </div>

     <div className="detailsRow">
                         <h3>Data de sfarsit: </h3> <p className="detailsP">{this.state.data.endDate}</p>
                    </div>
       <div className="detailsRow">
                           <h3>Obiective: </h3> <p className="detailsP">{this.state.data.objective}</p>
                      </div>
        <div className="detailsRow">
                            <h3>Cost total: </h3> <p className="detailsP">{this.state.data.totalCost}</p>
                       </div>
       <div className="detailsRow">
                           <h3>Contributie maxima: </h3> <p className="detailsP">{this.state.data.maxContribution}</p>
                      </div>
          <div className="detailsRow">
                                  <h3>Schema finantare: </h3> <p className="detailsP">{this.state.data.fundingScheme}</p>
                             </div>
         <div className="detailsRow">
                                 <h3>Coordonatori: </h3> <p className="detailsP">{this.state.data.coordinator}</p>
                            </div>

           <div className="detailsRow">
                                          <h3>Tari coordonatoare: </h3> <p className="detailsP">{this.state.data.coordinatorCountry}</p>
                                     </div>
                  <div className="detailsRow">
                                          <h3>Participanti: </h3> <p className="detailsP">{this.state.data.participants}</p>
                                     </div>
                 <div className="detailsRow">
                                         <h3>Tari participante: </h3> <p className="detailsP">{this.state.data.participantsCountry}</p>
                                    </div>

    </div>
    );
  }
}

export default Project;
