import React, {Component} from 'react';

import '../../styles/DateDisplay.css';

class DateDisplay extends Component {
    constructor(props) {
        super(props);
        

        this.state = {
            date: new Date().toDateString(),

        }
    }

    render() {
        return(
            <div className="date-display">
                <p>{this.state.date}</p>
            </div>
        );
    }
}

export default DateDisplay;