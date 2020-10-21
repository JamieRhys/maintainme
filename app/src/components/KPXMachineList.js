import React, {Component} from 'react';

import {API_URL} from './utils/Constants';
import {BaseTable} from './table/BaseTable';

class KPXMachineList extends Component {
    constructor(props) {
        super(props);

        this.state = { pc: [] };
    }

    componentDidMount() {
        fetch(API_URL + "entryPCs")
            .then((response) => response.json())
            .then((responseData) => { this.setState({ pc: responseData._embedded.entryPCs }); })
            .catch(err => console.error(err));
    }

    render() {

    }
}