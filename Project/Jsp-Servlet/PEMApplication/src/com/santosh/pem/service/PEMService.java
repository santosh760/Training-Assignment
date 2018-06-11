package com.santosh.pem.service;

import java.util.List;
import java.util.Map;

import com.santosh.pem.domain.Category;
import com.santosh.pem.domain.Expense;
import com.santosh.pem.domain.User;

/**
 * Inteface for PEM Service
 * @author Santosh Pandey
 *
 */
public interface PEMService {

	/**
	 * This method will register user
	 * @param user
	 * @return 1-success,0-failure
	 */
	int addUser(User user);
	
	/**
	 * This method will Login user into appliation
	 * @param loginName
	 * @return User
	 */
	User loginUser(String loginName);
	
	/**
	 * This method will add category
	 * @param category
	 * @param userId
	 * @return
	 */
	int addCategory(Category category);
	
	/**
	 * This method will help to list all category
	 * @param userId
	 * @return list of category
	 */
	List<Category> categoryList(Integer userId);
	
	/**
	 * This method will add Expense
	 * @param expense
	 * @return 1-success,0-failure
	 */
	int addExpense(Expense expense);
	
	/**
	 * This method will help to list all expense
	 * @param userId
	 * @param categoryId
	 * @return list of expense
	 */
	List<Expense> expenseList(Integer userId);
	
	/**
	 * This method will help to report all expense monthly wise
	 * @param userId
	 * @param categoryId
	 * @return list of expense
	 */
	Map<String,Integer> reportMonthly(Integer userId);
	
	/**
	 * This method will help to report all expense yearly wise
	 * @param userId
	 * @param categoryId
	 * @return list of expense
	 */
	Map<String,Integer> reportYearly(Integer userId);
	
	/**
	 * This method will help to report all expense category wise
	 * @param userId
	 * @param categoryId
	 * @return list of expense
	 */
	Map<Integer,Integer> reportCategoryWise(Integer userId);
	
}
