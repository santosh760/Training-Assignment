package com.santosh.pem.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class ReportCategoryWise
 */
@WebServlet("/ReportCategoryWise")
public class ReportCategoryWise extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PEMService service=new PEMServiceImpl();
		
		HttpSession session=request.getSession();
		Integer userId=(Integer) session.getAttribute("userId");
		
		Map<Integer,Integer> categoryWiseMap=service.reportCategoryWise(userId);
		
		for(Map.Entry<Integer, Integer> entry:categoryWiseMap.entrySet()){
			Integer key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println();
			System.out.println("Category ID---"+key);
			System.out.println("Expense-------"+value);
			
		}

		
		request.setAttribute("map", categoryWiseMap);
		RequestDispatcher rd=request.getRequestDispatcher("reportCategoryWise.jsp");
		rd.forward(request, response);
	}

}
