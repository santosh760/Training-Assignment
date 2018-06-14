package com.santosh.pem.dao;

import java.util.List;
import java.util.Map;

import com.santosh.pem.domain.Expense;

public interface ExpenseDAO {
	
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
	 * This method will remove expense
	 * @param categoryId
	 * @return 1-success 0-fail
	 */
	int removeExpense(Integer categoryId);
	
	/**
	 * This method will help to report all expense monthly wise
	 * @param userId
	 * @param categoryId
	 * @return list of expense
	 */
	List<Expense> reportMonthly(Integer userId);
	
	/**
	 * This method will help to report all expense yearly wise
	 * @param userId
	 * @param categoryId
	 * @return list of expense
	 */
	List<Expense> reportYearly(Integer userId);
	
	/**
	 * This method will help to report all expense category wise
	 * @param userId
	 * @param categoryId
	 * @return list of expense
	 */
	List<Expense> reportCategoryWise(Integer userId);

}
