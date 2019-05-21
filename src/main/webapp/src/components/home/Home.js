import React, { Component } from "react";
import "./Home.css"
class Home extends Component {
  render() {
    return (

       <div className="container">
            <div className="col">
                <h2> Ce este Cordis?</h2>
                <p >
Serviciul comunitar de informare în domeniul cercetării și dezvoltării (CORDIS) este sursa principală de rezultate a Comisiei Europene din proiectele finanțate prin programele-cadru ale UE pentru cercetare și inovare (PC1 la Orizont 2020).

Misiunea noastră este de a aduce rezultatele cercetării profesioniștilor din domeniu pentru a promova știința deschisă, a crea produse și servicii inovatoare și a stimula creșterea în Europa.</p>
            </div>
            <div className="col">

                <h2> Ce gasesti pe Cordis?</h2>
                            <p >

CORDIS dispune de un depozit public bogat și structurat, cu toate informațiile de proiect deținute de Comisia Europeană, cum ar fi fișele cu informații despre proiect, participanții, rapoartele, rezultatele și legăturile cu publicațiile cu acces liber.

CORDIS produce, de asemenea, propria gamă de publicații și articole pentru a vă ușura găsirea de rezultate relevante pe care le puteți utiliza în domeniul dvs. Edițiile tipărite sunt în limba engleză, iar versiunile web sunt disponibile și în franceză, germană, italiană, poloneză și spaniolă.</p>


            </div>
            <div className="col">
                          <h2> Cine utilizeaza Cordis?</h2>

                                      <p >
                                    CORDIS este gestionat de Oficiul pentru Publicații al Uniunii Europene în numele direcțiilor generale de cercetare și inovare ale Comisiei Europene, agențiilor executive și întreprinderilor comune, sprijinit de contractori specializați în domeniul serviciilor editoriale, de date și tehnice.

                                    CORDIS este unul dintre pietrele de temelie ale strategiei Comisiei de a disemina și exploata rezultatele cercetării și este guvernat și finanțat ca parte a programului-cadru <span>"Orizont 2020"</span>.
                                    </p>
                      </div>
          </div>
    );
  }
}

export default Home;
