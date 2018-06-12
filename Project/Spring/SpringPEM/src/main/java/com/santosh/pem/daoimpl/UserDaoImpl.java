package com.santosh.pem.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.santosh.pem.dao.UserDAO;
import com.santosh.pem.domain.User;
import com.santosh.pem.rowmapper.CustomUserRowMapper;

@Repository("UserDao")
public class UserDaoImpl implements UserDAO {
	
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

	public int addUser(User user) {
		String sql = "INSERT INTO users(firstName,lastName,loginName,password) VALUES(?,?,?,?)";
				
			
			int result=jdbcTemplate.update(sql, new Object[] {user.getFirstName(),user.getLastName(),user.getLoginName(),user.getPassword()});
			
			return result;
	}

	public User loginUser(String loginName) {
		String sql=null;
		User user = null;
		
			
				sql = "select * from users where loginName = ? ";
				user = new User();
				user=jdbcTemplate.queryForObject(sql, new CustomUserRowMapper(),loginName);
			
			return user;
	}

}
