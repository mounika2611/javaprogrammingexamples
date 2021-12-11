<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <html>
<head>
                    <title>Welcome to the Recipient Registration page</title>

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
                    width:430;
                    height:470px;
                    display: block;
                    position:absolute;
                    left:450px;
                    top: 120px;
}
.innertext{
                    display: block;
                    position:absolute;
                    left:80px;
                    top: 20px;       
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
                    width:450;
                    height:500;
                    font-size: 14px;
                    word-spacing: 9px;
                    line-height: 30px;

}
input[type="radio"]{
                    position:absolute;
                    left: 110px;
                    cursor:pointer;
                    
}
label[for="male"],label[for="female"],label[for="others"],label[for="yes"],label[for="no"]{
                    margin-bottom: 10px;
                    display:inline-block;
                    padding-left: 130px;
                    background-position:0 -32px ;
                    line-height: 24px;
                    cursor:pointer;
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
                                        
                                        <h1>Recipient Registration</h1>  
                    </div>
                    
   <img src="Images/Recipient.png" alt="donar image" height="400" width="400" style="position:absolute;left:60px;bottom: 150px;"> 
   <img src = "Images/logo.png" alt = "Connect Blood" style="position:absolute;bottom:20px;left:0px;width:270px;height:70px">
<div class="form">
                    <div class="innertext">
<label for="name">Recipient Name: </label>
  <input type="text" id="textarea" name="name"><br><br>
  <label for="name">Address: </label>
  <input type="text" id="textarea" name="name"><br><br>
  <label for="age">Age:</label>
  <input type="text" id="textarea" name="age"><br><br>
  <label for="gender">Gender:</label><br>
  <input type="radio" id="male"  name="gender">
<label for="male">Male</label><br>
<input type="radio"  id="female" name="gender">
<label for="female">Female</label><br>
<input type="radio"  id="others" name="gender">
<label for="others">Others</label><br>
 
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
  <label for="donated">Previously donated?</label><br><br>
  <input type="radio"  id="yes" name="donated">
<label for="yes">Yes</label><br>
<input type="radio"  id="no" name="donated">
<label for="no">No</label><br>
 

  <center><input type="reset" value="Reset">
                      <input type="submit" id="submit" value="Submit"></center>
                    </div>
                    
</div>
<div>
                    <p class ="requirements"><b>Requirements to apply for Recipient:</b><br>

                                        A blood transfusion is a way of adding blood to your body after an illness or injury. If your body is missing one or more of the components that make up healthy blood, a transfusion can help supply what your body is missing.<br>

                                        <b>--></b>	If you have blood loss due to bleeding, surgery or a medical procedure.<br>
                                        
                                        <b>--></b> If your medical conditions prevent the body from producing new blood cells. Red blood cells normally have a life of three months, but medical conditions such as anaemia, kidney disease, cancer, leukaemia, chemotherapy and chronic disease may prevent the production of new blood cells. Transfusion may be necessary until the body can produce its blood cells.<br>
                                        
                                        <b>--></b>	If you have Disease or blood loss that hinder the clotting process in a patient's blood. Plasma and fresh frozen plasma transfused separately may be necessary to promote proper clotting.
                                        
                                        
                                        
                                       
                                        
                                        
                    </p><br>
</div>

</body>


</html>