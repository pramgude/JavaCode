import React,{Component} from 'react'
class CoursesPage extends Component{
super()
{
this.state={
Course:{
title:'React with Redux'    
}    
}  
this.handleChane=this.handleChane.bind(this)  
}
   handleChane=(event)=>{
       const Course={... this.state.Course, title:event.target.value}
       this.setState({Course:Course})
   } 
   handleSubmit=(event)=>{
       event.preventSubmit
   }
    render(){
        return (
            <form onSubmit={this.handleSubmit}>
            <h2>All Courses</h2>
            <h3>Add New Course</h3>
            {/* </form><input type="text" onChange={this.handleChane.bind(this)}  */}
            <input type="text" onChange={this.handleChane} 
            value={this.state.Course.title}></input>
            <input type="submit" value="save"></input>
            </form>
        )
    }
function()
}
export default CoursesPage