package com.santosh.pem.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.santosh.pem.dao.ExpenseDAO;
import com.santosh.pem.domain.Category;
import com.santosh.pem.domain.Expense;
import com.santosh.pem.rowmapper.CustomCategoryRowMapper;
import com.santosh.pem.rowmapper.CustomExpenseRowMapper;

@Repository("ExpenseDao")
public class ExpenseDaoImpl implements ExpenseDAO {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addExpense(Expense expense) {
		String sql = "INSERT INTO expense(userId,categoryId,amount,date,remark) VALUES(?,?,?,?,?)";
		
		
		int result=jdbcTemplate.update(sql, new Object[] {expense.getUserId(),expense.getCategoryId(),expense.getAmount(),expense.getDate(),expense.getRemark()});
		
		return result;
	}

	public List<Expense> expenseList(Integer userId) {
		String sql = "select * from expense where userId = ? ";
		
		List<Expense> listExpense=new ArrayList<Expense>();
		listExpense=jdbcTemplate.query(sql, new CustomExpenseRowMapper(),userId);
	
		return listExpense;
	}

	public int removeExpense(Integer expenseId) {
		
		String sql = "DELETE FROM expense WHERE expenseId=?";
		
		int result=jdbcTemplate.update(sql,expenseId);
	
		return result;
	}

	public List<Expense> reportMonthly(Integer userId) {
		String sql = "select * from expense where userId = ? ";
		
		List<Expense> listExpense=new ArrayList<Expense>();
		listExpense=jdbcTemplate.query(sql, new CustomExpenseRowMapper(),userId);
	
		return listExpense;
	}

	public List<Expense> reportYearly(Integer userId) {
		String sql = "select * from expense where userId = ? ";
		
		List<Expense> listExpense=new ArrayList<Expense>();
		listExpense=jdbcTemplate.query(sql, new CustomExpenseRowMapper(),userId);
	
		return listExpense;
	}

	public List<Expense> reportCategoryWise(Integer userId) {
		String sql = "select * from expense where userId = ? ";
		
		List<Expense> listExpense=new ArrayList<Expense>();
		listExpense=jdbcTemplate.query(sql, new CustomExpenseRowMapper(),userId);
	
		return listExpense;
	}

}
