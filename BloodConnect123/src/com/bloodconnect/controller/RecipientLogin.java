
package com.bloodconnect.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bloodconnect.model.Recipient;
import com.bloodconnect.service.RecipientLoginService;

public class RecipientLogin extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		String userId = request.getParameter("userId");	
		 String password = request.getParameter("password");
		 RecipientLoginService loginServicer = new RecipientLoginService();
		boolean result = loginServicer.authenticateUser(userId, password);
		Recipient recipient = loginServicer.getUserByUserId(userId);
		 if(result == true){
			 request.getSession().setAttribute("recipient", recipient);		
			 response.sendRedirect("recipientResultpage.jsp");
		 }
		 else{
			 response.sendRedirect("error.jsp");
		 }
	}

}