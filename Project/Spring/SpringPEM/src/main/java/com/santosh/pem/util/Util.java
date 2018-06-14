package com.santosh.pem.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Util extends DbUtil {
	
	public String getCategoryNameById(Integer categoryId){
		String sql="SELECT categoryName FROM category WHERE categoryId=?";
		String result=null;
		try {
			
			PreparedStatement stmt=connect().prepareStatement(sql);
			
			stmt.setInt(1, categoryId);
			
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				result=rs.getString(1);
			}
		
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
