package com.santosh.pem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.santosh.pem.domain.Category;
import com.santosh.pem.service.CategoryService;
import com.santosh.pem.service.UserService;

@Controller
@RequestMapping("/user")
public class CategoryController {
	
	@Autowired
	CategoryService CategoryService;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/addCategory.htm", method=RequestMethod.GET)
	 public ModelAndView showAddCategoryPage(){
		 ModelAndView model=new ModelAndView("addCategory");
		 return model;
	  }
	
	@RequestMapping(value="/addCategoryDetails.htm", method=RequestMethod.POST)
	 public ModelAndView addCategory(HttpServletRequest request,HttpServletResponse response,@RequestParam("categoryName")String categoryName){
		 
		Category category=new Category();
		
		Integer userId=(Integer) session.getAttribute("userid");
		
		category.setName(categoryName);
		category.setUserId(userId);
		
		int result=CategoryService.addCategory(category);
		
		if (result==1){
			ModelAndView model=new ModelAndView("addCategory");
			model.addObject("msg","Category Added..!!");
			 return model;
		}
		else{
			ModelAndView model=new ModelAndView("addCategory");
			model.addObject("msg","Failed..!!");
			 return model;
		}
		
	  }

	@RequestMapping(value="/listCategory.htm", method=RequestMethod.GET)
	 public ModelAndView listCategory(HttpServletRequest request,HttpServletResponse response){
		ModelAndView model=new ModelAndView("listCategory");
		
		Integer userId=(Integer) session.getAttribute("userid");
		
		List<Category> listCategory=CategoryService.categoryList(userId);
		
		model.addObject("list",listCategory);
		
		return model;
	
	}
}
