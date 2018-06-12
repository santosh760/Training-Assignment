package com.santosh.pem.dao;

import com.santosh.pem.domain.User;

public interface UserDAO {
	
	/**
	 * This method will register user
	 * @param user
	 * @return 1-success,0-failure
	 */
	int addUser(User user);
	
	/**
	 * This method will Login user into appliation
	 * @param loginName
	 * @return User
	 */
	User loginUser(String loginName);

}
