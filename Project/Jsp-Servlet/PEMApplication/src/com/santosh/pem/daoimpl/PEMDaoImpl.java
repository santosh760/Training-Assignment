package com.santosh.pem.daoimpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
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
		try
		{
			
			String sql= "INSERT INTO expense (userId,categoryId,amount,date,remark) VALUES (?,?,?,?,?)";
			
			PreparedStatement stmt=connect().prepareStatement(sql);
			
			stmt.setInt(1, expense.getUserId());
			stmt.setInt(2, expense.getCategoryId());
			stmt.setInt(3, expense.getAmount());
			stmt.setString(4, expense.getDate());
			stmt.setString(5, expense.getRemark());
			
			int result=stmt.executeUpdate();
			
			return result;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public List<Expense> expenseList(Integer userId) {
		try{
			String sql= "SELECT * FROM expense where userId=?";
			
			PreparedStatement stmt=connect().prepareStatement(sql);
			
			stmt.setInt(1, userId);
			
			ResultSet rs=stmt.executeQuery();
			
			List<Expense> expenseList=new ArrayList<>();
			
			while(rs.next()){
				
				Expense expense=new Expense(rs.getInt("expenseId"),rs.getInt("categoryId"), rs.getInt("amount"), rs.getString("date"), rs.getString("remark"));
				expenseList.add(expense);
				
			}
			
			return expenseList;
			}
			catch (SQLException e){
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public Map<String,Integer> reportMonthly(Integer userId) {
		try{
			String sql= "SELECT date,amount FROM expense where userId=?";
			
			PreparedStatement stmt=connect().prepareStatement(sql);
			
			stmt.setInt(1, userId);
			
			ResultSet rs=stmt.executeQuery();
			
			Map<String,Integer> map=new HashMap<>();
			
			while(rs.next()){
				String date=rs.getString("date");
				Integer amount=rs.getInt("amount");
//				String year=date.substring(0, 4);
//				String month=date.substring(5,7);
				String yearMonth=date.substring(0, 7);
				System.out.println(yearMonth);
				if(map.containsKey(yearMonth)){
					int total=map.get(yearMonth);
					total=total+amount;
					map.put(yearMonth, total);
				}
				else{
					map.put(yearMonth, amount);
				}
				
				
			}
			
			return map;
			}
			catch (SQLException e){
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public Map<String,Integer> reportYearly(Integer userId) {
		try{
			String sql= "SELECT date,amount FROM expense where userId=?";
			
			PreparedStatement stmt=connect().prepareStatement(sql);
			
			stmt.setInt(1, userId);
			
			ResultSet rs=stmt.executeQuery();
			
			Map<String,Integer> map=new HashMap<>();
			
			while(rs.next()){
				String date=rs.getString("date");
				Integer amount=rs.getInt("amount");
				String year=date.substring(0, 4);
				if(map.containsKey(year)){
					int total=map.get(year);
					total=total+amount;
					map.put(year, total);
				}
				else{
					map.put(year, amount);
				}
				
				
			}
			
			return map;
			}
			catch (SQLException e){
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public Map<Integer,Integer> reportCategoryWise(Integer userId) {
		try{
			String sql= "SELECT categoryId,SUM(amount) as 'total' FROM expense where userId=? GROUP BY categoryId";
			
			PreparedStatement stmt=connect().prepareStatement(sql);
			
			stmt.setInt(1, userId);
			
			ResultSet rs=stmt.executeQuery();
			
			Map<Integer,Integer> map=new TreeMap<>();
			
			while(rs.next()){
				
				map.put(rs.getInt("categoryId"), rs.getInt("total"));
				
			}
			
			return map;
			}
			catch (SQLException e){
				e.printStackTrace();
			}
			return null;
	}

}
