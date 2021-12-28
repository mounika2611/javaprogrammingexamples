<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <html>
<head>
  <title>Welcome to the Donor Registration page</title>
<form action="DonorRegisterServlet" method="POST">
</head>
<style>
*{
                    margin:0;
                    padding:0;
                    list-style:none;
                    text-decoration: none;
}
.header{
                    width:100%;
                    height: 50px;
                    display: block;
                    background-color:hsl(0, 87%, 76%);
                    text-align:center;
                    font-size: 18px;
                    padding: 10px;
                    font-family: cursive;
}
.form{
                    border: 5px outset red;
                    background-color:lightblue;
                    width:400px;
                    height:400px;
                    display: block;
                    position:absolute;
                    left:450px;
                    top: 150px;
}
.innertext{
                    display: block;
                    position:absolute;
                    left:60px;
                    top: 40px;       
}
#textarea{
                    border-radius: 4px;
                    background-color:rgb(247, 250, 236) ;
                    float:right;
}
.requirements{
                    display:block;
                    position:absolute;
                    right:5px;
                    top:90px;
                    font-style: italic;
                    width:400;
                    height:500;
                    font-size: 15px;
                    word-spacing: 10px;
                    line-height: 30px;
}


#area{
                    position:absolute;
                    left:110px;
                    border-radius: 4px;
                    background-color:rgb(247, 250, 236) ;
}
</style>
<body style="background-image:url('Images/blue_background.jpg')">
                    
                    <div class="header">
                                        
                                        <h1>Donor Registration</h1>  
                    </div>
                    
   <img src="Images/donor.png" alt="Donar image" height="350" width="350" style="position:absolute;left:20px;bottom: 140px;"> 
   <img src = "Images/logo.png" alt = "Connect Blood" style="position:absolute;bottom:20px;left:0px;width:270px;height:70px">
<div class="form">
                    <div class="innertext">
<label for="name">Donor Name: </label>
  <input type="text" id="textarea" name="name"><br><br>
  <label for="name">Address: </label>
  <input type="text" id="textarea" name="name"><br><br>
  <label for="age">Age:</label>
  <input type="text" id="textarea" name="age"><br><br>
  <label for="gender">Gender:</label>
  <input type="radio" id="male"  name="gender">
<label for="male">Male</label>
<input type="radio"  id="female" name="gender">
<label for="female">Female</label>
<input type="radio"  id="others" name="gender">
<label for="others">Others</label><br><br>
 
  <label for="Mobile">Mobile Number: </label>
  <input type="text" id="textarea" name="Mobile"><br><br>
  <label for="bloodgroup">Blood Group: </label>
  <select id="area" name="bloodgroup"><br><br>
      <option value="A">Group A+</option>
      <option value="B">Group B+</option>
      <option value="AB">Group AB+</option>
      <option value="O">Group O+</option>
      <option value="A">Group A-</option>
      <option value="B">Group B-</option>
      <option value="AB">Group AB-</option>
      <option value="O">Group O-</option>
  </select><br><br>
   <label for="name">DonorUserId: </label>
  <input type="text" id="textarea" name="name"><br><br>
   <label for="name">Donor Password: </label>
  <input type="text" id="textarea" name="name"><br><br>

  <center>
        
   <input type="submit" id="submit" value="Submit">
    <input type="reset" value="Reset">  
   </center>
  </div>
                    
</div>
<div>
                    <p class ="requirements"><b>Basic requirements for donors:</b><br><br>

                                       <b>*</b>	The donor must be fit and healthy, and should not be suffering from transmittable diseases.<br><br>
                                        
                                        <b>*</b>	<b>Age and weight</b>- Between 18â€“65 years old and should weigh a minimum of 50 kg.<br><br>
                                        
                                        <b>*</b> <b>Pulse rate</b>- Between 50 and 100 without irregularities.<br><br>
                                        
                                        <b>*</b>	<b>Haemoglobin level</b>- A minimum of 12.5 g/dL.<br><br>
                                        
                                       <b>*</b>	<b>Blood pressure</b>- Diastolic: 50â€“100 mm Hg, Systolic: 100â€“180 mm Hg.<br><br>
                                        
                                        <b>*</b>	<b>Body temperature</b>- Should be normal, with an oral temperature not exceeding 37.5 Â°C.<br><br>
                                        
                                        <b>*</b>	The time period between successive blood donations should be more than 3 months.</p><br><br>
</div>

</body>


</html>