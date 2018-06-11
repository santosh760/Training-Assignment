package com.santosh.pem.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.santosh.pem.service.PEMService;
import com.santosh.pem.serviceimpl.PEMServiceImpl;

/**
 * Servlet implementation class ReportYearly
 */
@WebServlet("/ReportYearly")
public class ReportYearly extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PEMService service=new PEMServiceImpl();
		
		HttpSession session=request.getSession();
		Integer userId=(Integer) session.getAttribute("userId");
		
		Map<String, Integer> yearlyReport=service.reportYearly(userId);
		
		for(Map.Entry<String, Integer> entry:yearlyReport.entrySet()){
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println();
			System.out.println("Category ID---"+key);
			System.out.println("Expense-------"+value);
			
		}
		
		request.setAttribute("map", yearlyReport);
		RequestDispatcher rd=request.getRequestDispatcher("reportYearly.jsp");
		rd.forward(request, response);
		
	}

}
