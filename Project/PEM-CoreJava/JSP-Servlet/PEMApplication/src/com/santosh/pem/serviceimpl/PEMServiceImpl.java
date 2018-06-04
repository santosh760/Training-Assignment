package com.santosh.pem.serviceimpl;

import java.util.List;

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

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User loginUser(String loginName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addCategory(Category category, Integer userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Category> categoryList(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addExpense(Expense expense, Integer categoryId, Integer userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Expense> expenseList(Integer userId, Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Expense> reportMonthly(Integer userId, Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Expense> reportYearly(Integer userId, Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Expense> reportCategoryWise(Integer userId, Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
