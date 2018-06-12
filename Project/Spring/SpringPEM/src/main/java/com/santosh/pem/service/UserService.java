package com.santosh.pem.service;

import com.santosh.pem.domain.User;

public interface UserService {
	
	/**
	 * This method will register user
	 * @param user
	 * @return 1-success,0-failure
	 */
	int addUser(User user);
	
	/**
	 * This method will Login user into application
	 * @param loginName
	 * @return User
	 */
	User loginUser(String loginName);

}
