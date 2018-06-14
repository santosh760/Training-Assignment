package com.santosh.pem.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santosh.pem.dao.CategoryDAO;
import com.santosh.pem.dao.ExpenseDAO;
import com.santosh.pem.domain.Expense;
import com.santosh.pem.service.ExpenseService;

@Service ("ExpenseService")
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseDAO dao;
	
	public int addExpense(Expense expense) {
		
		return dao.addExpense(expense);
	}

	public List<Expense> expenseList(Integer userId) {
		
		return dao.expenseList(userId);
	}

	public int removeExpense(Integer categoryId) {
		
		return dao.removeExpense(categoryId);
	}

	public List<Expense> reportMonthly(Integer userId) {
		
		return dao.reportMonthly(userId);
	}

	public List<Expense> reportYearly(Integer userId) {
		
		return dao.reportYearly(userId);
	}

	public List<Expense> reportCategoryWise(Integer userId) {
		
		return dao.reportCategoryWise(userId);
	}

}
