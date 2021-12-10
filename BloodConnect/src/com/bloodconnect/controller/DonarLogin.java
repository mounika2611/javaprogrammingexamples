package com.bloodconnect.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bloodconnect.model.Donar;
import com.bloodconnect.service.DonarLoginService;

public class DonarLogin extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		String userId = request.getParameter("userId");	
		 String password = request.getParameter("password");
		 DonarLoginService loginServiced = new DonarLoginService();
		boolean result = loginServiced.authenticateUser(userId, password);
		Donar donar = loginServiced.getUserByUserId(userId);
		 if(result == true){
			 request.getSession().setAttribute("donar", donar);		
			 response.sendRedirect("donarResultpage.jsp");
		 }
		 else{
			 response.sendRedirect("error.jsp");
		 }
	}

}
/*package com.javawebtutor.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javawebtutor.model.User;
import com.javawebtutor.service.LoginService;


public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

	 String userId = request.getParameter("userId");	
	 String password = request.getParameter("password");
	 LoginService loginService = new LoginService();
	 boolean result = loginService.authenticateUser(userId, password);
	 User user = loginService.getUserByUserId(userId);
	 if(result == true){
		 request.getSession().setAttribute("user", user);		
		 response.sendRedirect("home.jsp");
	 }
	 else{
		 response.sendRedirect("error.jsp");
	 }
}

}*/