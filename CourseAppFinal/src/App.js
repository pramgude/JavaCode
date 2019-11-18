import React from 'react';
import {Route,Switch} from 'react-router-dom'

import HomePage from './components/home/HomePage'
import AboutPage from './components/about/AboutPage'

import './App.css';
import Header from './components/common/Header';
import PageNotFound from './components/PageNotFound'
import CoursesPage from './components/courses/CoursesPage';

function App() {
  return (
    <div className="container-fluid">     
      <Header/>
      <Switch>      
      <Route exact path='/'>
           <HomePage/>
      </Route>
      <Route path="/about"><AboutPage/></Route>
      <Route path='/courses' component={CoursesPage}/>
      <Route><PageNotFound/></Route>
      </Switch>
    </div>
  );
}

export default App;
