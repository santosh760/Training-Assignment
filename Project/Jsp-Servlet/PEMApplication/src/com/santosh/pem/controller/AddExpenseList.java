package com.santosh.pem.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class AddExpenseList
 */
@WebServlet("/AddExpenseList")
public class AddExpenseList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PEMService service=new PEMServiceImpl();
		
		HttpSession session=request.getSession();
		Integer userId=(Integer) session.getAttribute("userId");
		
		List<Category> categoryList=service.categoryList(userId);
		
		request.setAttribute("catList", categoryList);
		RequestDispatcher rd=request.getRequestDispatcher("addExpense.jsp");
		rd.forward(request, response);
	}

}
