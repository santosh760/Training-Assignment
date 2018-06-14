package com.santosh.pem.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.santosh.pem.domain.Expense;

public class CustomExpenseRowMapper implements RowMapper<Expense> {

	public Expense mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Expense expense=new Expense();
		expense.setUserId(rs.getInt(1));
		expense.setCategoryId(rs.getInt(2));
		expense.setExpenseId(rs.getInt(3));
		expense.setAmount(rs.getInt(4));
		expense.setDate(rs.getString(5));
		expense.setRemark(rs.getString(6));
		return expense;
	}

}
