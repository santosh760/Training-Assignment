package com.santosh.pem.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.santosh.pem.dao.CategoryDAO;
import com.santosh.pem.domain.Category;

@Repository("CategoryDao")
public class CategoryDaoImpl implements CategoryDAO {
	
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

	public int addCategory(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Category> categoryList(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
