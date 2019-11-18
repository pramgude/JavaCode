<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


</head>
<style type="text/css">
.imageHolder {
    position: relative;
    width: 285px;
    height: 175px;
}
.imageHolder .caption {
    position: absolute;
    width: 283px;
    height: 50px;
    bottom: 0px;
    left: 0px;
    color: #ffffff;
    background: green;
	text-align:center;
	font-weight:bold;
	opacity:0.7;
}
.half div {
  float: left;
  width: 50%;
  padding-right: 100px;
}

div.raspberry {
    float: left;
    margin: 2px;
}

div p {
    text-align: center;
}
.walk{
            padding-left:20px;
        }
</style>
</head>
<body>

<body>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book My Show</title>
</head>
<body>
 
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">BOOKMYSHOW</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">movie</a></li>
      <li><a href="#">Event</a></li>
      <li><a href="#">Play</a></li>
      <li><a href="#">Sport</a></li>
    </ul>
    <form class="navbar-form navbar-left" action="/action_page.php">
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search" name="search">
        <div class="input-group-btn">
          <button class="btn btn-default" type="submit">
            <i class="glyphicon glyphicon-search"></i>
          </button>
        </div>
      </div>
    </form>
  </div>
</nav>
<style>
.mySlides {display:none}
</style>
</head>

<div style="background:#FFB6C1">

		 <a href="http://localhost:8080/Film/BookPage2.jsp"><img width="425" height="300" border="3" align="center"  src="http://localhost:8080/Film/resources/images/Badla.jpg"/></a>
		<a href="http://localhost:8080/Film/BookPage2.jsp"><img width="425" height="300" border="3" align="center"  src="http://localhost:8080/Film/resources/images/RAW.jpg"/></a> 
		<a href="http://localhost:8080/Film/BookPage2.jsp"><img width="425" height="300" border="3" align="center"  src="http://localhost:8080/Film/resources/images/Kalank.jpg"/></p></a> <br/><br/>    
	</div>	
	
 
  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Collections</a>
    </div>
    </nav>  
    
   </div>
    <div>
    <div class = "raspberry">
    <!-- <a href="http://localhost:8080/Film/BookPage2.jsp"> -->
        <img src="http://localhost:8080/Film/resources/images/images123.jpg" width="250" height="200" alt="Music"/>
        <p>Music <br></p>
        </a>
    </div>
    <div class = "raspberry">
        <img src="http://localhost:8080/Film/resources/images/Monuments.jpg" width="250" height="200" alt="Screen 3"/>
        <p>Monuments <br> </p>
    </div>
    <div class = "raspberry">
        <img src="http://localhost:8080/Film/resources/images/Sport.jpg" width="250" height="200" alt="Screen 3"/>
        <p>Sport <br> </p>
    </div>
    <div class = "raspberry">
        <img src="http://localhost:8080/Film/resources/images/Adventure.jpg" width="250" height="200" alt="Screen 3"/>
        <p>Adventure <br> </p>
    </div>
</div>
<script>
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function currentDiv(n) {
  showDivs(slideIndex = n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("demo");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" w3-red", "");
  }
  x[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " w3-red";
}
</script>
</body>
</html>