package com.santosh.pem.daoimpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.santosh.pem.DbUtil.DbUtil;
import com.santosh.pem.dao.PEMDao;
import com.santosh.pem.domain.Category;
import com.santosh.pem.domain.Expense;
import com.santosh.pem.domain.User;

/**
 * This class will provide implementation of Dao
 * @author Santosh Pandey
 *
 */
public class PEMDaoImpl extends DbUtil implements PEMDao {

	
	@Override
	public int addUser(User user) {
		try
		{
			String sql= "INSERT INTO users (firstName,lastName,loginName,password) VALUES (?,?,?,?)";
			
			PreparedStatement stmt=connect().prepareStatement(sql);
			
			stmt.setString(1, user.getFirstName());
			stmt.setString(2, user.getLastName());
			stmt.setString(3, user.getLoginName());
			stmt.setString(4, user.getPassword());
			
			int result=stmt.executeUpdate();
			
			return result;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public User loginUser(String loginName) {
		
		try{
		String sql= "SELECT * FROM users where loginName=?";
		
		PreparedStatement stmt=connect().prepareStatement(sql);
		
		stmt.setString(1, loginName);
		
		ResultSet rs=stmt.executeQuery();
		
		User user=null;
		
		while(rs.next()){
			
			user=new User( rs.getInt("id"),rs.getString("firstName"), rs.getString("lastName"), rs.getString("loginName"), rs.getString("password"));
		}
		
		return user;
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public int addCategory(Category category) {
		try
		{
			String sql= "INSERT INTO category (userId,categoryName) VALUES (?,?)";
			
			PreparedStatement stmt=connect().prepareStatement(sql);
			
			stmt.setInt(1, category.getUserId());
			stmt.setString(2, category.getName());
			
			int result=stmt.executeUpdate();
			
			return result;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public List<Category> categoryList(Integer userId) {
		try{
			String sql= "SELECT * FROM category where userId=?";
			
			PreparedStatement stmt=connect().prepareStatement(sql);
			
			stmt.setInt(1, userId);
			
			ResultSet rs=stmt.executeQuery();
			
			List<Category> categoryList=new ArrayList<>();
			
			while(rs.next()){
				
				Category category=new Category(rs.getInt("categoryId"),rs.getString("categoryName"));
				categoryList.add(category);
				
			}
			
			return categoryList;
			}
			catch (SQLException e){
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public int addExpense(Expense expense) {
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
