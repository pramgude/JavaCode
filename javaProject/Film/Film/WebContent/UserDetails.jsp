<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserDetails</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/bsvalidate/style.css">

</head>
<body>


<link rel="stylesheet" href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/css/bootstrap.min.css'
    media="screen" />
<form method="post"  id="form1">
<div style="max-width: 400px;">
   
    <label for="txtUsername">
        Username</label>
    <input name="txtUsername" type="text" id="txtUsername" class="form-control" placeholder="Enter Username"
        required />
    <br />
    
   
    <label for="inputMobileNo" class="control-label">Mobile No</label>
    <input type="text" id="UserMobile" maxlength="10"  minlength="10" data-fv-numeric="true" data-fv-numeric-message="Please enter valid phone numbers" data-fv-phone-country11="IN" required="required" data-fv-notempty-message="This field cannot be left blank." placeholder="Mobile No. " class="form-control" name="data[User][mobile]" data-fv-field="data[User][mobile]">   
     </br>
            
    <p>SELECT YOUR Address    
        <select type="text" value="" name="Subject">
         <option>Select</option> 
            <option>Pune</option> 
            <option>Mumbai</option> 
            <option>Delhi</option> 
             
        </select></p><br><br> 
    
    
    <label for="txtPassword">
        Password</label>
    <input name="txtPassword" type="password" id="txtPassword" title="Password must contain: Minimum 8 characters atleast 1 Alphabet and 1 Number"
        class="form-control" placeholder="Enter Password" required pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$" />
    <br />
    <label for="txtConfirmPassword">
        Confirm Password</label>
    <input name="txtConfirmPassword" type="password" id="txtConfirmPassword" class="form-control"
        placeholder="Confirm Password" />
    <br />
    <label for="txtEmail">
        Email</label>
    <input name="txtEmail" id="txtEmail" class="form-control" placeholder="Enter Email"
        required type="email" />
    <hr />
    <input type="submit" onclick="return confirm('ok')" />
</div>
</form>
<script type="text/javascript">
    window.onload = function () {
        var txtPassword = document.getElementById("txtPassword");
        var txtConfirmPassword = document.getElementById("txtConfirmPassword");
        txtPassword.onchange = ConfirmPassword;
        txtConfirmPassword.onkeyup = ConfirmPassword;
        function ConfirmPassword() {
            txtConfirmPassword.setCustomValidity("");
            if (txtPassword.value != txtConfirmPassword.value) {
                txtConfirmPassword.setCustomValidity("Passwords do not match.");
            }
        }
    }
</script>

 <a href="http://localhost:8080/Film/PaymentPage.jsp">next</a> <br/><br/> 

</body>
</html>