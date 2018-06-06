package com.santosh.pem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.santosh.pem.domain.User;
import com.santosh.pem.service.PEMService;
import com.santosh.pem.serviceimpl.PEMServiceImpl;

/**
 * Servlet implementation class loginUser
 */
@WebServlet("/loginUser")
public class loginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PEMService service=new PEMServiceImpl();
		
		String loginName=request.getParameter("loginName");
		String password=request.getParameter("password");
		
		User user=service.loginUser(loginName);
		
		if(user.getPassword().equalsIgnoreCase(password)){
			
			HttpSession session=request.getSession();
			session.setAttribute("userName", user.getFirstName());
			session.setAttribute("userId", user.getId());
			response.sendRedirect("userHome.jsp");
		}
		else {
			
			response.sendRedirect("login.jsp");
		}
	}

}
