import React, {Component} from 'react';

import "./styles/Home.css"

import {API_URL} from './utils/Constants';
import ClockDisplay from './elements/displays/ClockDisplay';
import DateDisplay from './elements/displays/DateDisplay';
import VersionBar from './elements/bars/VersionBar';

class Home extends Component {
    constructor(props) {
        super(props);

        this.state = {
            userFirstName: "",
            userLastName: "",
            userIsAdmin:""
        }
    }

    componentDidMount() {
        this.getUserDetails();
    }

    getUserDetails() {
        const token = sessionStorage.getItem("jwt");
        fetch(API_URL + "entityUsers/search/findByUsername?username=" + sessionStorage.getItem("username"),
            {
                headers: {'Authorization': token}
            })
            .then((response) => response.json())
            .then((responseData) => {
                this.setState({userFirstName: responseData.firstName});
                this.setState({userLastName: responseData.lastName});
                this.setState({userIsAdmin: responseData.isAdmin});
            })
            .catch((err) => console.error(err));
    }

    render() {
        return(
            <div className="container-root">
                <div className="title-bar">
                    <div className="user-greeting">
                        <h3>hello {this.state.userFirstName}</h3>
                    </div>
                    <div className="container-date-time">
                        <DateDisplay />
                        <ClockDisplay />
                    </div>
                </div>
                <div className="container-version-bar">
                    <VersionBar />
                </div>
                <div className="container-content">
                </div>
            </div>
        )
    }
}

export default Home;