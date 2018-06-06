package com.santosh.pem.dao;

import java.util.List;

import com.santosh.pem.domain.Category;
import com.santosh.pem.domain.Expense;
import com.santosh.pem.domain.User;

/**
 * Inteface for PEM DAO
 * @author Santosh Pandey
 *
 */
public interface PEMDao {

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
	 * @return 1-success,0-fail
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
	List<Expense> expenseList(Integer userId,Integer categoryId);
	
	/**
	 * This method will help to report all expense monthly wise
	 * @param userId
	 * @param categoryId
	 * @return list of expense
	 */
	List<Expense> reportMonthly(Integer userId,Integer categoryId);
	
	/**
	 * This method will help to report all expense yearly wise
	 * @param userId
	 * @param categoryId
	 * @return list of expense
	 */
	List<Expense> reportYearly(Integer userId,Integer categoryId);
	
	/**
	 * This method will help to report all expense category wise
	 * @param userId
	 * @param categoryId
	 * @return list of expense
	 */
	List<Expense> reportCategoryWise(Integer userId,Integer categoryId);
	
}
