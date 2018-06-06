package com.santosh.pem.serviceimpl;

import java.util.List;

import com.santosh.pem.dao.PEMDao;
import com.santosh.pem.daoimpl.PEMDaoImpl;
import com.santosh.pem.domain.Category;
import com.santosh.pem.domain.Expense;
import com.santosh.pem.domain.User;
import com.santosh.pem.service.PEMService;

/**
 * this class will provide implementation of PEMService interface
 * @author Santosh Pandey
 *
 */
public class PEMServiceImpl implements PEMService {

	PEMDao dao=new PEMDaoImpl();
	
	@Override
	public int addUser(User user) {
		
		return dao.addUser(user);
	}

	@Override
	public User loginUser(String loginName) {
		
		return dao.loginUser(loginName);
	}

	@Override
	public int addCategory(Category category) {
		// TODO Auto-generated method stub
		return dao.addCategory(category);
	}

	@Override
	public List<Category> categoryList(Integer userId) {
		
		return dao.categoryList(userId);
	}

	@Override
	public int addExpense(Expense expense) {
		
		return dao.addExpense(expense);
	}

	@Override
	public List<Expense> expenseList(Integer userId, Integer categoryId) {
		
		return dao.expenseList(userId, categoryId);
	}

	@Override
	public List<Expense> reportMonthly(Integer userId, Integer categoryId) {
		
		return dao.reportMonthly(userId, categoryId);
	}

	@Override
	public List<Expense> reportYearly(Integer userId, Integer categoryId) {
		
		return dao.reportYearly(userId, categoryId);
	}

	@Override
	public List<Expense> reportCategoryWise(Integer userId, Integer categoryId) {
		
		return dao.reportCategoryWise(userId, categoryId);
	}

}
