import React,{Component} from 'react'
import {connect} from 'react-redux'
import * as courseActions from '../../redux/actions/courseActions'
import PropTypes from 'prop-types'
class CoursesPage extends Component{
    constructor(){
        super()
        this.state={
            course:{
                title:''
                
            }
        }
       // this.handleChange=this.handleChange.bind(this)
    }
    handleChange=(event)=>{
        const course= {...this.state.course, title:event.target.value}
        //this.setState({course:course})

        //OR
        this.setState({course})
    }
    handleSubmit=(event)=>{
        event.preventDefault()
        //debugger;
       // alert(this.state.course.title)
       this.props.dispatch(courseActions.createCourse(this.state.course))
     //this.props.actions.createCourse(this.state.course)
    }
    render(){
        return (
        <form onSubmit={this.handleSubmit}>
            <h2>All Courses</h2>
            <h3>Add New Course</h3>
            {/* <input type="text" onChange={this.handleChange.bind(this)}  */}
            <input type="text" onChange={this.handleChange} 
            value={this.state.course.title}/>
            <input type="Submit" value="Save"/>
            {this.props.courses.map(course=>(
            <div key={course.title}>
            {course.title}
            </div>
            ))}
        </form>
             
        )
    }

}
CoursesPage.propTypes = {
    courses:PropTypes.array.isRequired,
    dispatch:PropTypes.func.isRequired
}

function mapStateToProps(state){
   // debugger;
    return{
        courses:state.courses
    }
}
export default connect(mapStateToProps)(CoursesPage)