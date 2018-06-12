package com.santosh.pem.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.santosh.pem.dao.ExpenseDAO;
import com.santosh.pem.domain.Expense;

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
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Expense> expenseList(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int removeExpense(Expense expense) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Map<String, Integer> reportMonthly(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Integer> reportYearly(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<Integer, Integer> reportCategoryWise(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
