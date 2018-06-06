package com.santosh.pem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.santosh.pem.domain.Category;
import com.santosh.pem.service.PEMService;
import com.santosh.pem.serviceimpl.PEMServiceImpl;

/**
 * Servlet implementation class AddCategory
 */
@WebServlet("/AddCategory")
public class AddCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PEMService service=new PEMServiceImpl();
		
		String categoryName=request.getParameter("categoryName");
		HttpSession session=request.getSession();
		Integer userId=(Integer) session.getAttribute("userId");
		System.out.println(userId);
		
		Category category=new Category(categoryName , userId);
		System.out.println("dssdfdsd");
		int result= service.addCategory(category);
		System.out.println(result);
		if(result==1){
			response.sendRedirect("userHome.jsp");
		}
		else
		{
	
			response.sendRedirect("addCategory.jsp");
		}
	}

}
