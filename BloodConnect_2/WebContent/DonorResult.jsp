<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import=" com.bloodconnect.model.Donor"%>
<%@page import=" com.bloodconnect.service.DonorLoginService"%>
<%@page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
	 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	 
	 <title>Donor Details</title>	
</head>
<body style="background-image:url('Images/blue_background.jpg')">
<center>
	 
		 <h1>Donor Details</h1>
			 <b>This is Sample Result Page</b><br/>
			 <%=new Date()%></br>
			 <%
				 Donor donor = (Donor) session.getAttribute("donor");
			 %>		
			 
			 
			 <a href="Donorlogout.jsp">Logout</a>
		 </p>

		 <table>
			 <thead>
				 <tr>
					 <th>Donor Name</th>
					 <th>Donor UserId</th>
					 <th>Address</th>
					 <th>Email</th>
					 <th>MobileNumber</th>					
				 </tr>
			 </thead>
			 <tbody>
				 <%
					 DonorLoginService donorloginService = new DonorLoginService();
					 List<Donor> list = donorloginService.getListOfUsers();
					 for (Donor u : list) {
				 %>
				 <tr>
					 
					 <td><%=u.getDonorName()%></td>
					 <td><%=u.getDonorUserId()%></td>
					 <td><%=u.getBloodgroup()%></td>
					 <td><%=u.getAddress()%></td>
					 <td><%=u.getEmail()%></td>
					 <td><%=u.getMobileNumber()%></td>
					 
				 </tr>
				 <%}%>
			 <tbody>
		 </table>		
		 <br/>
	
	</center>	
</body>
</html>
    