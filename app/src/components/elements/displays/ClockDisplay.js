import React, {Component} from 'react';

import '../../styles/ClockDisplay.css';

class ClockDisplay extends Component {
    constructor(props) {
        super(props);

        this.state = {
            time: new Date().toLocaleTimeString
        }
    }

    componentDidMount() {
        this.intervalID = setInterval(() =>
            this.updateClock(), 1000
        );
    }

    componentWillUnmount() {
        clearInterval(this.intervalID);
    }

    updateClock() {
        this.setState({time: new Date().toLocaleTimeString() });
    }

    render() {
        return(
            <div className="clock-display">
                <p>{this.state.time}</p>
            </div>
        );
    }
}

export default ClockDisplay;