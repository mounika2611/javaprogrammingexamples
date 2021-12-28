<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import=" com.bloodconnect.model.Recipient"%>
<%@page import=" com.bloodconnect.service.RecipientLoginService"%>
<%@page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
	 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	 
	 <title>Result Page</title>	
</head>
<body style="background-image:url('Images/blue_background.jpg')">
<center>
	 <div id="container">
		 <h1>Result Page</h1>
			 <b>This is Sample Result Page</b><br/>
			 <%=new Date()%></br>
			 <%
			 Recipient recipient = (Recipient) session.getAttribute("recipient");
			 %>		
			 
			 <b>Welcome
			 
			
			 
			  </b>		
			 <br/>
			 <a href="Recipientlogout.jsp">Logout</a>
		 </p>

		 <table>
			 <thead>
				 <tr>
					 <th>Recipient Name</th>
					 <th>Recipient UserId</th>
					 <th>Address</th>
					 <th>Email</th>
					 <th>MobileNumber</th>
				 </tr>
			 </thead>
			 <tbody>
				 <%
				 RecipientLoginService recipientLoginService = new RecipientLoginService();
					 List<Recipient> list = recipientLoginService.getListOfUsers();
					 for (Recipient u : list) {
				 %>
				 <tr>
					 
					 <td><%=u.getRecipientName()%></td>
					 <td><%=u.getRecipientUserId()%></td>
					 <td><%=u.getBloodgroup()%></td>
					 <td><%=u.getAddress()%></td>
					 <td><%=u.getEmail()%></td>
					 <td><%=u.getMobileNumber()%></td>
					 
				 </tr>
				 <%}%>
			 <tbody>
		 </table>		
		 <br/>
	 </div>
	</center>	
</body>
</html>
    