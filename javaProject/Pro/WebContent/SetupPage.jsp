<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script> -->
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
<title>setup</title>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: white;
}
.login-form {
		width: 400px;
    	margin: 30px auto;
	}
* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 10px;
  background-color: #DAFAFA;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 85%;
  padding: 5px;
  margin: 5px 0 15px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
  
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}

div {
  display: inline-block; 
}
</style>
</head>
<body>

<form action="/action_page.php">
<div class="login-form">
  <div class="container">
    <h1 class="text-center">Register</h1>
    <p class="text-center">Please fill in this form to create an account.</p>
    <hr>
	 <label for="USer Name"><b>User Name</b></label>
    <input type="text" placeholder="Enter User Name" name="User Name" required>
    
    <label for="USer Name"><b>User ID</b></label>
    <input type="text" placeholder="Enter User ID" name="User ID" required>
    
    <label for="USer Name"><b>User Source</b></label>
    <input type="text" placeholder="Enter User Source" name="User Source" required>
    
    
    <form name="myform" id="myForm">
  <select id="countySel" size="1">
        <option value="" selected="selected">-- Select Country --</option>
    </select>
     <br>
    <br>
  
    <select id="stateSel" size="1">
        <option value="" selected="selected">-- Select State--</option>
    </select>
    <br>
    <br>    
    <select id="citySel" size="1">
        <option value="" selected="selected">-- Select City--</option>
    </select>
    <br>
    <br>
    <select id="zipSel" size="1">
        <option value="" selected="selected">-- Select Zip--</option>
    </select>
</form>
    
    
    <label for="Address1"><b>Address1</b></label>
    <input type="text" placeholder="Enter Address1" name="Address1" required>
    
    <label for="Address2"><b>Address2</b></label>
    <input type="text" placeholder="Enter Address2" name="Address2" required>
    
    <label for="Gender"><b>Gender</b></label></br>
    <input type="radio" name="gender" value="male"> Male
	<input type="radio" name="gender" value="female"> Female<br>
  </form>  
    <hr>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <button type="submit" class="registerbtn">Register</button>
  </div>
  
  <div class="container signin">
    <p>Already have an account? <a href="#">Sign in</a>.</p>
  </div>
  </div>
<script type="text/javascript">
var countryStateInfo = {
		"USA": {
			"California": {
				"Los Angeles": ["90001", "90002", "90003", "90004"],
				"San Diego": ["92093", "92101"]
			},
			"Texas": {
				"Dallas": ["75201", "75202"],
				"Austin": ["73301", "73344"]
			}
		},
		"India": {
			"Assam": {
				"Dispur": ["781005"],
				"Guwahati" : ["781030", "781030"]
			},
			"Gujarat": {
				"Vadodara" : ["390011", "390020"],
				"Surat" : ["395006", "395002"]
			}
		}
	}


	window.onload = function () {
		
		//Get html elements
		var countySel = document.getElementById("countySel");
		var stateSel = document.getElementById("stateSel");	
		var citySel = document.getElementById("citySel");
		var zipSel = document.getElementById("zipSel");
		
		//Load countries
		for (var country in countryStateInfo) {
			countySel.options[countySel.options.length] = new Option(country, country);
		}
		
		//County Changed
		countySel.onchange = function () {
			 
			 stateSel.length = 1; // remove all options bar first
			 citySel.length = 1; // remove all options bar first
			 zipSel.length = 1; // remove all options bar first
			 
			 if (this.selectedIndex < 1)
				 return; // done
			 
			 for (var state in countryStateInfo[this.value]) {
				 stateSel.options[stateSel.options.length] = new Option(state, state);
			 }
		}
		
		//State Changed
		stateSel.onchange = function () {		 
			 
			 citySel.length = 1; // remove all options bar first
			 zipSel.length = 1; // remove all options bar first
			 
			 if (this.selectedIndex < 1)
				 return; // done
			 
			 for (var city in countryStateInfo[countySel.value][this.value]) {
				 citySel.options[citySel.options.length] = new Option(city, city);
			 }
		}
		
		//City Changed
		citySel.onchange = function () {
			zipSel.length = 1; // remove all options bar first
			
			if (this.selectedIndex < 1)
				return; // done
			
			var zips = countryStateInfo[countySel.value][stateSel.value][this.value];
			for (var i = 0; i < zips.length; i++) {
				zipSel.options[zipSel.options.length] = new Option(zips[i], zips[i]);
			}
		}	
	}

</script>
</body>
</html>