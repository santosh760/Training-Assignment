package com.santosh.pem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.santosh.pem.domain.User;
import com.santosh.pem.service.PEMService;
import com.santosh.pem.serviceimpl.PEMServiceImpl;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PEMService service=new PEMServiceImpl();
		
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String loginName=request.getParameter("loginName");
		String password=request.getParameter("password");
		
		User user=new User(firstName, lastName, loginName, password);
		
		int result=service.addUser(user);
		
		if(result==1){
			response.sendRedirect("login.jsp");
		}
		else
		{
	
			response.sendRedirect("registeration.jsp");
		}
	}

}
