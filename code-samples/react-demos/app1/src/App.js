import React from 'react';
import logo from './logo.svg';
import './App.css';


function App(p) {
  const items = p.data.map((e)=>
    <tr>
      <td>{e.firstName}</td>
      <td>{e.lastName}</td>
    </tr>);
    console.log(items);
  const element = 
    <div>
    <h1>Employee List</h1>
    <table>
      <thead>
      <tr>
        <td>First Name</td>
        <td>Last Name</td>
      </tr>
      </thead>
      <tbody>
      {items}
      </tbody> 
      </table>
      </div>;
  return element;
}

export default App;
