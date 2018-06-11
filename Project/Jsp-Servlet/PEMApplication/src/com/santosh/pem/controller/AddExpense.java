package com.santosh.pem.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.santosh.pem.domain.Expense;
import com.santosh.pem.service.PEMService;
import com.santosh.pem.serviceimpl.PEMServiceImpl;

/**
 * Servlet implementation class AddExpense
 */
@WebServlet("/AddExpense")
public class AddExpense extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PEMService service=new PEMServiceImpl();
		
		Integer categoryId=Integer.parseInt(request.getParameter("categoryId"));
		Integer amount=Integer.parseInt(request.getParameter("amount"));
		String remark=request.getParameter("remark");
		
		String date=request.getParameter("date");
		
		HttpSession session=request.getSession();
		int userId=(int) session.getAttribute("userId");
		
		Expense expense=new Expense(categoryId, amount, date, remark, userId);
		int result= service.addExpense(expense);
		if(result==1){
			response.sendRedirect("userHome.jsp");
		}
		else
		{
	
			response.sendRedirect("addExpense.jsp");
		}
		
	}

}
