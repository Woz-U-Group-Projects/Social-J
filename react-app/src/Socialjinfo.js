import React, { Component } from "react";
import "./Socialjinfo.css";
import PropTypes from "prop-types";

function Socialjinfo(props) {
    return (
        <div className="socialjinfo">
            <h1> Welcome to {props.title}!</h1>
            <h2>{props.description}</h2>
        </div>
    );
}

Socialjinfo.propTypes = {
    title: PropTypes.string.isRequired
};
export default Socialjinfo;