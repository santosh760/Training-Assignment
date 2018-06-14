/**
 * 
 */
package com.santosh.pem.util;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author Santosh Pandey
 *
 */
public class DbUtil {

	
public Connection connect(){
		
		try {
			
			Properties p=new Properties();
			p.load(DbUtil.class.getResourceAsStream("/DBProperties.properties"));
			
			String driver=p.getProperty("driver");
			String url=p.getProperty("url");
			String username=p.getProperty("username");
			String password=p.getProperty("password");
			
			Class c = Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			
			return con;
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
}
