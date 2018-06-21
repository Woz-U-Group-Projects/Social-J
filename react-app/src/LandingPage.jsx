import React, { Component } from 'react';
import './LandingPage.css';

class LandingPage extends Component {
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
}

export default LandingPage;
