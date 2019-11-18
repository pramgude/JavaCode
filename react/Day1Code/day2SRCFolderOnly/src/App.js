import React,{Component} from 'react';
import {CardList} from './components/card-list/card-list.component'

import './App.css';

class App extends Component{
  
constructor(){
  super()
  this.state ={
    allusers:[],
    searchField:''
      
    
  }
}
componentDidMount(){
  fetch('https://jsonplaceholder.typicode.com/users')
  //.then(response=>console.log(response))
  .then((res)=>res.json())
 // .then((users)=>console.log(users))
 .then((users)=>this.setState({allusers:users}))
}

  render(){
    const allusers=this.state.allusers
const searchField=this.state.searchField
    return(
        
  <div className='App'>
    <input
     type="search" 
     placeholder="search user" 
    onChange={(e)=> {
      this.setState({searchField:e.target.value},()=>
      console.log(this.state))
      
    }}/>
    {/* <h1><u>
          Welome To React Application.........
          </u></h1> */}
    <CardList allusers={this.state.allusers} />
      

       
        {/* <p>{this.state.msg}</p> */}
        
      {/* <button onClick={()=>this.setState({msg:'Hello Everyone'})}>Change Text</button> */}
      
      </div>
     
    )
  }

}

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Welome To React Application.........
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//          Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

export default App;
