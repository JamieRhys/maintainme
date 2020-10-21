import React, {Component} from 'react';

import {API_URL} from './utils/Constants';
import {BaseTable} from './table/BaseTable';

class VersionTable extends Component {
    constructor(props) {
        super(props);

        this.state = { softwareEntry: [] };
    }

    componentDidMount() {
        fetch(API_URL + "entrySoftwares")
            .then((response) => response.json())
            .then((responseData) => { this.setState({softwareEntry: responseData._embedded.softwareEntrys }); })
            .catch(err => console.err(err));
    }

    render() {
        const tableColumns = React.useMemo(() => [
            {
                
            }
        ])
    }
}