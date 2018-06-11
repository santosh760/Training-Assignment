package com.santosh.pem.serviceimpl;

import java.util.List;
import java.util.Map;

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
	public List<Expense> expenseList(Integer userId) {
		
		return dao.expenseList(userId);
	}

	@Override
	public Map<String,Integer> reportMonthly(Integer userId) {
		
		return dao.reportMonthly(userId);
	}

	@Override
	public Map<String,Integer> reportYearly(Integer userId) {
		
		return dao.reportYearly(userId);
	}

	@Override
	public Map<Integer,Integer> reportCategoryWise(Integer userId) {
		
		return dao.reportCategoryWise(userId);
	}

}
