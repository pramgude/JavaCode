<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>



<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookTicket</title>
</head>
<body>

 <!-- <link> doesn't need a closing tag -->
    <link href="CSS/Master.css" rel="stylesheet" type="text/css">
    <!-- include the jQuery UI style sheet -->
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <!-- include jQuery -->
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <!-- include jQuery UI -->
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  </head>
  <body>
    <div id="Datepicker1"></div>

    <script type="text/javascript">
      $(function() {
        $("#Datepicker1").datepicker({
         numberOfMonths: 1
        }); 
      });
      
      
      
      
     /*  @section Scripts {

    	    @Scripts.Render("~/bundles/jqueryui")
    	    @Styles.Render("~/Content/cssjqryUi")
 */
    	    /* <script type="text/javascript">
    	        $(document).ready(function () {
    	            $('input[type=datetime]').datepicker({
    	                dateFormat: "dd/M/yy",
    	                changeMonth: true,
    	                changeYear: true,
    	                
    	            });

    	        }); */
    	    </script>
    </script>
<ul>
<li>City Pride </li>

<!--  <input type="submit" value="12:00"  /> -->
		<a href="http://localhost:8080/Film/BookPage3.jsp">12:00pm</a><span></span><span></span>

		<a href="http://localhost:8080/Film/BookPage3.jsp">3:00pm</a> 
		<!--  <input type="submit" value="4:00" /> -->
		<a href="http://localhost:8080/Film/BookPage3.jsp">4:00pm</a>
		<!--  <input type="submit" value="7:00" /> -->
		<a href="http://localhost:8080/Film/BookPage3.jsp">7:00pm</a>
		<!--  <input type="submit" value="9:00" /> -->
		<a href="http://localhost:8080/Film/BookPage3.jsp">9:00pm</a> <br/><br/>

</ul>

<ul>
<li>E-square </li>
 <!-- <input type="submit" value="12:00" /> -->
		<a href="http://localhost:8080/Film/BookPage3.jsp">12:00pm</a> 
<!--  <input type="submit" value="3:00" /> -->
		<a href="http://localhost:8080/Film/BookPage3.jsp">3:00pm</a> 
		<!--  <input type="submit" value="4:00" /> -->
		<a href="http://localhost:8080/Film/BookPage3.jsp">4:00pm</a> 
		<!--  <input type="submit" value="7:00" /> -->
		<a href="http://localhost:8080/Film/BookPage3.jsp">7:00pm</a> 
		<!--  <input type="submit" value="9:00" /> -->
		<a href="http://localhost:8080/Film/BookPage3.jsp">9:00pm</a> <br/><br/>
</ul>

</body>
</html>