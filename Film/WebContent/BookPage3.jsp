<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SeatReservation</title>
</head>
<body>



<style>
/* Popup container - can be anything you want */
.popup {
  position: relative;
  display: inline-block;
  cursor: pointer;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

/* The actual popup */
.popup .popuptext {
  visibility: hidden;
  width: 160px;
  background-color: #555;
  color: #fff;
  text-align: center;
  border-radius: 6px;
  padding: 8px 0;
  position: absolute;
  z-index: 1;
  bottom: 125%;
  left: 50%;
  margin-left: -80px;
}

/* Popup arrow */
.popup .popuptext::after {
  content: "";
  position: absolute;
  top: 100%;
  left: 50%;
  margin-left: -5px;
  border-width: 5px;
  border-style: solid;
  border-color: #555 transparent transparent transparent;
}

/* Toggle this class - hide and show the popup */
.popup .show {
  visibility: visible;
  -webkit-animation: fadeIn 1s;
  animation: fadeIn 1s;
}

/* Add animation (fade in the popup) */
@-webkit-keyframes fadeIn {
  from {opacity: 0;} 
  to {opacity: 1;}
}

@keyframes fadeIn {
  from {opacity: 0;}
  to {opacity:1 ;}
}
</style>
</head>
<body style="text-align:center">
</script>

</body>
</html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

/* Button used to open the chat form - fixed at the bottom of the page */
.open-button {
  background-color: #555;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  opacity: 0.8;
  position: fixed;
  bottom: 23px;
  right: 28px;
  width: 280px;
}

/* The popup chat - hidden by default */
.chat-popup {
  display: none;
  position: fixed;
  bottom: 0;
  right: 15px;
  border: 3px solid #f1f1f1;
  z-index: 9;
}

/* Add styles to the form container */
.form-container {
  max-width: 300px;
  padding: 10px;
  background-color: white;
}

/* Full-width textarea */
.form-container textarea {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
  resize: none;
  min-height: 200px;
}

/* When the textarea gets focus, do something */
.form-container textarea:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit/send button */
.form-container .btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  margin-bottom:10px;
  opacity: 0.8;
}

/* Add a red background color to the cancel button */
.form-container .cancel {
  background-color: red;
}

/* Add some hover effects to buttons */
.form-container .btn:hover, .open-button:hover {
  opacity: 1;
}
</style>
</head>
<body>

<h2>How many seat require</h2>
<p>Click on the button at the bottom of this page to open the seat form.</p>


<button class="open-button" onclick="openForm()">Seat</button>

<div class="chat-popup" id="myForm">
    <h1>Seat</h1>
   <label for="msg"><b>Seat</b></label>
   <div>
 <p>Click the button to display the time.</p>
<button onclick="getElementById('demo').innerHTML=Date()">What is the time?</button>

<p id="demo"></p>

   </div>
    <!--  <form action="http://localhost:8080/Film/SelectSeat.jsp" class="form-container"> -->
     <form action="http://localhost:8080/Film/web/index.html" class="form-container">
     <input type="submit" value="1"  onclick="return confirm('200rs')"/>
      <input type="submit" value="2" onclick="return confirm('400rs')"/>
       <input type="submit" value="3" onclick="return confirm('600rs')"/>
        <input type="submit" value="4" onclick="return confirm('800rs')"/>
         <input type="submit" value="5" onclick="return confirm('1000rs')"/>
          <input type="submit" value="6" onclick="return confirm('1200rs')"/>
           <input type="submit" value="7" onclick="return confirm('1400rs')"/>
            <input type="submit" value="8" onclick="return confirm('1600rs')"/>
             <input type="submit" value="9" onclick="return confirm('1800rs')"/>
              <input type="submit" value="10" onclick="return confirm('20000rs')"/>
   <!--  <textarea placeholder="Type message.." name="msg" required></textarea> -->
    <button type="submit" class="btn">Send</button>
    <button type="button" class="btn cancel" onclick="closeForm()">Cancel</button>
  </form>
</div>

<script>
function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}

</script>
</body>
</html>