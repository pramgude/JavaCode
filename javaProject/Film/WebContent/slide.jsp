<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/slideshow.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="slideshow">

 

  <input type="radio" name="slide" id="item-1" checked="checked" />

  <div class="slideshow-item">

    <img src="http://localhost:8080/Film/resources/images/Badla.jpg" />

    <label for="item-3" class="previous">Go to slide 3</label>

    <label for="item-2" class="next">Go to slide 2</label>

  </div>

 

  <input type="radio" name="slide" id="item-2" />

  <div class="slideshow-item">

    <img src="http://localhost:8080/Film/resources/images/RAW.jpg" />

    <label for="item-1" class="previous">Go to slide 1</label>

    <label for="item-3" class="next">Go to slide 3</label>

  </div>

 

  <input type="radio" name="slide" id="item-3" />

  <div class="slideshow-item">

    <img src="http://localhost:8080/Film/resources/images/Kalank.jpg" />

    <label for="item-2" class="previous">Go to slide 2</label>

    <label for="item-1" class="next">Go to slide 1</label>

  </div>

 

</div>

</body>
</html>