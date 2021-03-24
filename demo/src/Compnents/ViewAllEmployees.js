import React, { Component } from 'react'
import EmployeeService from '../Service/EmployeeService';

export default class ViewEmployees extends Component {
    constructor(){
        super();

        this.state = {
            Employee : []
        }
    }

    componentDidMount(){
        EmployeeService.getAllEmployees()
        .then(res=>{
            this.setState({
                Employee : res.data
            })
        })
    }

    render(){
        const {Employee} = this.state;
        return(
            <>
            <table>
                <tr>
                    <th>Last name</th>
                    <th>Nic</th>
                    <th>Username</th>
                    <th>Email</th>
                </tr>

                {Employee.map((row) => (
                    <tr key={row.id}>
                        <td>{row.lastName}</td>
                        <td>{row.nic}</td>
                        <td>{row.userName}</td>
                        <td>{row.email}</td>
                    </tr>
                ))}
            </table>
            </>
        );
    }
}