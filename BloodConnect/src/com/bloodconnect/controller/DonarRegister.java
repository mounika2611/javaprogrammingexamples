


package com.bloodconnect.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bloodconnect.model.Donar;
import com.bloodconnect.service.DonarRegisterService;




public class DonarRegister extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	 response.setContentType("text/html;charset=UTF-8");
	 PrintWriter out = response.getWriter();
	
	 
	 String DonarName=request.getParameter("DonarName");
     Long  Age=request.getContentLengthLong();
     String Gender=request.getParameter("Gender");
     String Address=request.getParameter("Address");
     Long  MobileNumber=request.getContentLengthLong();
	 String Email=request.getParameter("Email");
     String DonarUserId=request.getParameter("DonarUserId");
     String DonarPassword=request.getParameter("DonarPassword");
	 Donar donar = new Donar(DonarName,Age,Gender,Address,MobileNumber,Email,DonarUserId,DonarPassword);
			
	 try {	
		 DonarRegisterService registerServiced = new DonarRegisterService();
		// boolean result = registerServiced.register(donar);	
		 boolean result =registerServiced.register(donar);
		 out.println("<html>");
		 out.println("<head>");		
		 out.println("<title>Registration Successful</title>");		
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<center>");
		 if(result){
			 out.println("<h1>Thanks for Registering with us :</h1>");
			 out.println("To login with UserId and Password<a href=Main.jsp>Click here</a>");
		 }else{
			 out.println("<h1>Registration Failed</h1>");
			 out.println("To try again<a href=donar.jsp>Click here</a>");
		 }
		 out.println("</center>");
		 out.println("</body>");
		 out.println("</html>");
	 } finally {		
		 out.close();
	 }
}

}