package com.santosh.pem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santosh.pem.dao.UserDAO;
import com.santosh.pem.domain.User;
import com.santosh.pem.service.UserService;

@Service ("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO dao;
	
	public int addUser(User user) {
		
		return dao.addUser(user);
	}

	public User loginUser(String loginName) {
		
		return dao.loginUser(loginName);
	}

}
