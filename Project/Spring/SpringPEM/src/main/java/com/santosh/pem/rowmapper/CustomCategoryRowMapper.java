package com.santosh.pem.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.santosh.pem.domain.Category;

public class CustomCategoryRowMapper implements RowMapper<Category> {

	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		Category category=new Category();
		category.setUserId(rs.getInt(1));
		category.setCategoryId(rs.getInt(2));
		category.setName(rs.getString(3));
		return category;
	}

}
