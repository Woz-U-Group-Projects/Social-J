import React, { Component } from 'react';
import './LandingPage.css';
import axios from 'axios';


const url = '';

class LandingPage extends Component {
    //initialize the url 
    render() {
        return (
            <div className="App">
                <header className="App-header">
                    <img src='/logo.svg' className="App-logo" alt="logo" />
                    <h1 className="App-title">Social-J [hard-coded]</h1>
                </header>
                <p className="App-intro">
                    Social-J is a social media application where users can discuss a topic chosen by the site. 
                </p>
            </div>
        );
    }

    componentDidMount(){
        //get the url using the get method from 'axios'
        axios.fetch(url).then((res) => {
            //do stuff to data here:
            console.log(res)
        }).catch((err) => {
            //display this after the error:
            console.log(err)
        })
    }
    render(){
        return(
            <span> </span>
        )
    }

}

export default LandingPage;
