package com.santosh.pem.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santosh.pem.dao.CategoryDAO;
import com.santosh.pem.dao.UserDAO;
import com.santosh.pem.domain.Category;
import com.santosh.pem.service.CategoryService;

@Service ("CategoryService")
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDAO dao;

	public int addCategory(Category category) {
		
		return dao.addCategory(category);
	}

	public List<Category> categoryList(Integer userId) {
		
		return dao.categoryList(userId);
	}

}
