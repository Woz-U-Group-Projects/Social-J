import React, { Component } from 'react';
import "./App.css";
import SocialjList from "./SocialjList";
import axios from "axios";
const URL = "http://localhost:8080/api/socialjinfos";


class App extends Component {

  state = {
    socialjinfos: []
  };

  componentDidMount() {
    axios.get(URL)
      .then(response => {
        console.log(response)
        const newList = response.data.map(c => {
          console.log(newList)
          return {
            id: c.id,
            title: c.title,
            description: c.description
          };
        });

        const newState = Object.assign({}, this.state, {
          socialjinfos: newList
        });

        this.setState(newState);
      })
      .catch(error => console.log(error));
  }
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <SocialjList socialjinfos={this.state.socialjinfos} />
        </header>
      </div>
    );
  }
}
export default App;