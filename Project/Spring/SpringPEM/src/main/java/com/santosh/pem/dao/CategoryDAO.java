package com.santosh.pem.dao;

import java.util.List;

import com.santosh.pem.domain.Category;

public interface CategoryDAO {
	
	/**
	 * This method will add category
	 * @param category
	 * @return 1-success,0-fail
	 */
	int addCategory(Category category);
	
	/**
	 * This method will help to list all category
	 * @param userId
	 * @return list of category
	 */
	List<Category> categoryList(Integer userId);

}
