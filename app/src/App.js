import React, {Component} from 'react';


import './App.css';
import Login from './components/Login';
import PCList from './components/PCList';
import {API_URL} from './components/utils/Constants';

//import MuiThemeProvider from '@material-ui/core/styles/MuiThemeProvider';
import {createMuiTheme, MuiThemeProvider} from '@material-ui/core/styles';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';

export const THEME = createMuiTheme();

class App extends Component {
  

  constructor(props) {
    super(props);
    
    this.state = { user: "user" };
  }

  componentDidMount() {
    fetch(API_URL + "entityUsers")
      .then((response) => response.json())
      .then((responseData) => { this.setState({ user: responseData._embedded.entityUsers }); })
      .catch((err) => console.error(err));
  }

  render() {
    return(
      <div className="App">
        <Login />
      </div>
    );
  }
}

export default App;