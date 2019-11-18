<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/fontawesome.css" integrity="sha384-vd1e11sR28tEK9YANUtpIOdjGW14pS87bUBuOIoBILVWLFnS+MCX9T6MMf0VdPGq" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
<title>Select Seat Position</title>
<style>
        .seat {
            height: 20px;
            width: 20px;
          border: 1px solid gray;
           cursor:pointer;
           background-color:Mediumslateblue;
        }
        .walk{
            padding-left:20px;
        }
        
    </style>
</head>
<body>
     
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
 <div style="border:2px solid gray; width:300px;">
    <div class="row info">
        <div class="col-sm-4"><label class="reserved"><input type="checkbox" class="cust-checkbox" ><span></span>Reserve Seat </label></div>
        <div class="col-sm-4"><label class="selected"><input type="checkbox" class="cust-checkbox" ><span></span>Selected Seat </label></div>
        <div class="col-sm-4"><label ><input type="checkbox" class="cust-checkbox" ><span></span>Empty Seat </label></div>
    </div>
   
    <!-- <div>
    <span style="font-size: 2rem;">
    <span style="color: Mediumslateblue;">A
       <span style="font-size: 3rem;">
  <span style="color: Mediumslateblue;">
            <i class="fas fa-couch"></i>
           
         <i class="fas fa-couch"></i>
          <i class="fas fa-couch"></i>
           <i class="fas fa-couch"></i>
      <i class="fas fa-couch"></i>
       </div>  
        <div>
        <span style="font-size: 2rem;">
    <span style="color: Mediumslateblue;">B
     <span style="font-size: 3rem;">
  <span style="color: Mediumslateblue;">
       <i class="fas fa-couch"></i>
        <i class="fas fa-couch"></i>
         <i class="fas fa-couch"></i>
          <i class="fas fa-couch"></i>
           <i class="fas fa-couch"></i>
           
       </div> 
       <div>
       <span style="font-size: 2rem;">
    <span style="color: Mediumslateblue;">C
       <span style="font-size: 3rem;">
  <span style="color: Mediumslateblue;">
       <i class="fas fa-couch"></i>
        <i class="fas fa-couch"></i>
         <i class="fas fa-couch"></i>
          <i class="fas fa-couch"></i>
           <i class="fas fa-couch"></i>
           
       </div> 
       <div>
       <span style="font-size: 2rem;">
    <span style="color: Mediumslateblue;">D
       <span style="font-size: 3rem;">
  <span style="color: Mediumslateblue;">
      <i class="fas fa-couch"></i>
        <i class="fas fa-couch"></i>
         <i class="fas fa-couch"></i>
          <i class="fas fa-couch"></i>
           <i class="fas fa-couch"></i>
         
       </div> 
       <div>
       <span style="font-size: 2rem;">
    <span style="color: Mediumslateblue;">E
       <span style="font-size: 3rem;">
  <span style="color: Mediumslateblue;">
       <i class="fas fa-couch"></i>
        <i class="fas fa-couch"></i>
         <i class="fas fa-couch"></i>
          <i class="fas fa-couch"></i>
           <i class="fas fa-couch"></i>
          
       </div> 
 -->
        <table>
            
             <tr>
                <td colspan="8"></td>
                <td align="right"> <div id="driver"></div> </td>
            </tr>
            <tr>
            <th scope="row"></th>
                <td><div class="fas fa-couch"></div> </td>
                <td><div class="fas fa-couch"></div></td>
                <td><div class="fas fa-couch"></div> </td>
                <td><div class="fas fa-couch"></div></td>
                <td class="walk">  </td>
                <td><div class="fas fa-couch"></div></td>
                <td><div class="fas fa-couch"></div></td>
                <td><div class="fas fa-couch"></div> </td>
                <td><div class="fas fa-couch"></div></td>
            </tr>
            
    <tr>
    <th scope="row">A</th>
                <td><div class="seat" id="A1">1</div> </td>
                <td><div class="seat" id="A2">2</div></td>
                 <td><div class="seat" id="A3">3</div> </td>
                <td><div class="seat" id="4">4</div></td>
                <td class="walk">  </td>
                <td><div class="seat" id="A5">5</div></td>
                <td><div class="seat" id="A6">6</div></td>
                 <td><div class="seat" id="A7">7</div> </td>
                <td><div class="seat" id="A8">8</div></td>
            </tr>
            <tr>
              <th scope="row">B</th>
                <td><div class="seat" id="B1">1</div> </td>
                <td><div class="seat" id="B2">2</div></td>
                 <td><div class="seat" id=""B3>3</div> </td>
                <td><div class="seat" id="B4">4</div></td>
                <td class="walk">  </td>
                <td><div class="seat" id=B5>5</div></td>
                <td><div class="seat" id="B6">6</div></td>
                 <td><div class="seat" id="B7">7</div> </td>
                <td><div class="seat" id="B8">8</div></td>
            </tr>
            <tr>
              <th scope="row">C</th>
                <td><div class="seat" id="C1">1</div> </td>
                <td><div class="seat" id="C2">2</div></td>
                 <td><div class="seat" id="C3">3</div> </td>
                <td><div class="seat" id="C4">4</div></td>
                <td class="walk">  </td>
                <td><div class="seat" id="C5">5</div></td>
                <td><div class="seat" id="C6">6</div></td>
                 <td><div class="seat" id="C7">7</div> </td>
                <td><div class="seat" id="C8">8</div></td>
            </tr>
            <tr>
              <th scope="row">D</th>
                 <td><div class="seat" id="D1">1</div> </td>
                <td><div class="seat" id="D2">2</div></td>
                 <td><div class="seat" id="D3">3</div> </td>
                <td><div class="seat" id="D4">4</div></td>
                <td class="walk">  </td>
                <td><div class="seat" id="D5">5</div></td>
                <td><div class="seat" id="D6">6</div></td>
                 <td><div class="seat" id="D7">7</div> </td>
                <td><div class="seat" id="D8">8</div></td>
            </tr>
            <tr>
              <th scope="row">E</th>
               <td><div class="seat" id="E1">1</div> </td>
                <td><div class="seat" id="E2">2</div></td>
                 <td><div class="seat" id="E3">3</div> </td>
                <td><div class="seat" id="E4">4</div></td>
                <td class="walk">  </td>
                <td><div class="seat" id="E5">5</div></td>
                <td><div class="seat" id="E6">6</div></td>
                 <td><div class="seat" id="E7">7</div> </td>
                <td><div class="seat" id="E8">8</div></td>
            </tr>
           
            
            
        </table>
    </div>
     </script>
     <script>

     allSeats = document.querySelectorAll('.seat');
     for (var i = 0; i < allSeats.length; i++) {
         var seat = allSeats[i];
         seat.addEventListener('click', function () {
             var bgclr = this.style.backgroundColor;
             if(bgclr =='green')
                 this.style.backgroundColor = 'Mediumslateblue'
             else
                 this.style.backgroundColor = 'green'
                	 
             debugger
         }, false);
     }
     
    </script>

			</table>
		</div>
	
		<a href="http://localhost:8080/Film/UserDetails.jsp">BOOK</a> <br/><br/> 
	</body>
	<script type="text/javascript" src="js/prima.js"></script>
</body>
</html>