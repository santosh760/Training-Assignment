package com.santosh.pem.service;

import java.util.List;

import com.santosh.pem.domain.Category;

public interface CategoryService {
	
	/**
	 * This method will add category
	 * @param category
	 * @param userId
	 * @return
	 */
	int addCategory(Category category);
	
	/**
	 * This method will help to list all category
	 * @param userId
	 * @return list of category
	 */
	List<Category> categoryList(Integer userId);

}
