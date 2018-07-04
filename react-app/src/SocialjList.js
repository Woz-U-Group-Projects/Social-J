import React from "react";
import Socialjinfo from "./Socialjinfo";

function SocialjList(props) {
    return (
        <div>
            {props.socialjinfos.map(c =>
                <Socialjinfo key={c.id} title={c.title} description={c.description} />)}
        </div>
    );
}

export default SocialjList;