import React, {Component} from 'react';

import './styles/Login.css';
import Home from './Home';

//import {ThemeProvider as MuiThemeProvider} from '@material-ui/styles';
import {MuiThemeProvider} from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import Snackbar from '@material-ui/core/Snackbar';

import {SERVER_URL} from './utils/Constants';
import {THEME} from '../App';

class Login extends Component {
    constructor(props) {
        super(props);

        this.state = {
            username: "",
            password: "",
            isAuthenticated: false,
            open: false
        };
    }

    handleChange = (event) => {
        this.setState({[event.target.name]: event.target.value});
    }

    handleClose = (event) => {
        this.setState({ open: false });
    }

    login = () => {
        const user = {username: this.state.username, password: this.state.password};

        fetch(SERVER_URL + "/login", { method: 'POST', body: JSON.stringify(user)})
            .then(response => {
                const jwtToken = response.headers.get("Authorization");
                if(jwtToken !== null) {
                    sessionStorage.setItem("jwt", jwtToken);
                    sessionStorage.setItem("username", this.state.username);
                    this.setState({isAuthenticated: true});
                } else {
                    this.setState({open: true});
                }
            })
            .catch(err => console.error(err));
    }

    render() {
        return(<Home />);

        if(this.state.isAuthenticated === true) {
            return(<Home />);
        } else {
            return(
               <div className="login-container">
                   <div className="login-box">
                       <div className="login-title">
                           <h2>Welcome</h2>
                       </div>
                       <div className="login-content">
                           <MuiThemeProvider theme={THEME}>
                               <h1>Maintain Me</h1>
                               <TextField name="username" placeholder="Username" onChange={this.handleChange} />
                               <br />
                               <TextField type="password" name="password" placeholder="Password" onChange={this.handleChange} />
                               <br />
                               <br />
                               <Button onClick={this.login} variant="outlined" color="primary">Login</Button>
                               <Snackbar open={this.state.open} onClose={this.handleClose} autoHideDuration={2000} message="Check your username and password" />
                           </MuiThemeProvider>
                       </div>
                   </div>
               </div>
            );
        }
        
    }
}

export default Login;