package com.santosh.pem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.santosh.pem.domain.Category;
import com.santosh.pem.domain.Expense;
import com.santosh.pem.service.CategoryService;
import com.santosh.pem.service.ExpenseService;
import com.santosh.pem.util.Util;

@Controller
@RequestMapping("/user")
public class ExpenseController extends Util {
	
	@Autowired
	ExpenseService ExpenseService;
	
	@Autowired
	CategoryService CategoryService;
	
	@Autowired
	HttpSession session;

	@RequestMapping(value="/addExpensePage.htm", method=RequestMethod.GET)
	 public ModelAndView showAddExpensePage(){
		 ModelAndView model=new ModelAndView("addExpense");
		 Integer userId=(Integer) session.getAttribute("userid");
		 
		 List<Category> listCategory=CategoryService.categoryList(userId);
		 model.addObject("list",listCategory);
		 return model;
	  }
	
	@RequestMapping(value="/addExpense.htm", method=RequestMethod.POST)
	 public ModelAndView addExpense(HttpServletRequest request,HttpServletResponse response,@ModelAttribute("expense")Expense expense){
		 
		Expense exp=new Expense();
		
		Integer userId=(Integer) session.getAttribute("userid");
		Integer categoryId=expense.getCategoryId();
		
		exp.setUserId(userId);
		exp.setCategoryId(expense.getCategoryId());
		exp.setAmount(expense.getAmount());
		exp.setDate(expense.getDate());
		exp.setRemark(expense.getRemark());
		
		int result=ExpenseService.addExpense(exp);
		
		if (result==1){
			ModelAndView model=new ModelAndView("addExpense");
			model.addObject("msg","Expense Added..!!");
			 return model;
		}
		else{
			ModelAndView model=new ModelAndView("addExpense");
			model.addObject("msg","Failed..!!");
			 return model;
		}
		
	  }
	
	@RequestMapping(value="/listExpense.htm", method=RequestMethod.GET)
	 public ModelAndView listCategory(HttpServletRequest request,HttpServletResponse response){
		ModelAndView model=new ModelAndView("listExpense");
		Map<String, Expense> map=new TreeMap<String, Expense>();
		Integer userId=(Integer) session.getAttribute("userid");
		
		List<Expense> listExpense=ExpenseService.expenseList(userId);
		for(int i=0;i<listExpense.size();i++){
			Expense exp=listExpense.get(i);
			String categoryName=getCategoryNameById(exp.getCategoryId());
			map.put(categoryName, listExpense.get(i));
		}
		model.addObject("list",map);
		
		return model;
	
	}
	
	@RequestMapping(value="/removeExpense.htm", method=RequestMethod.GET)
	 public ModelAndView removeCategory(HttpServletRequest request,HttpServletResponse response){
		ModelAndView model=new ModelAndView("removeExpense");
		
		Map<String, Expense> map=new TreeMap<String, Expense>();
		Integer userId=(Integer) session.getAttribute("userid");
		
		List<Expense> listExpense=ExpenseService.expenseList(userId);
		for(int i=0;i<listExpense.size();i++){
			Expense exp=listExpense.get(i);
			String categoryName=getCategoryNameById(exp.getCategoryId());
			map.put(categoryName, listExpense.get(i));
		}
		model.addObject("list",map);
		
		return model;
	}

	@RequestMapping(value="/deleteExpense.htm", method=RequestMethod.GET)
	 public ModelAndView deleteCategory(HttpServletRequest request,HttpServletResponse response,@RequestParam("expId")Integer expenseId){
		System.out.println(expenseId);
		int result=ExpenseService.removeExpense(expenseId);
		if(result==1){
			ModelAndView model=new ModelAndView("removeExpense");
			
			Map<String, Expense> map=new TreeMap<String, Expense>();
			Integer userId=(Integer) session.getAttribute("userid");
			
			List<Expense> listExpense=ExpenseService.expenseList(userId);
			for(int i=0;i<listExpense.size();i++){
				Expense exp=listExpense.get(i);
				String categoryName=getCategoryNameById(exp.getCategoryId());
				map.put(categoryName, listExpense.get(i));
			}
			model.addObject("list",map);
			
			return model;
		}
		else{
			ModelAndView model=new ModelAndView("removeExpense");
			
			Map<String, Expense> map=new TreeMap<String, Expense>();
			Integer userId=(Integer) session.getAttribute("userid");
			
			List<Expense> listExpense=ExpenseService.expenseList(userId);
			for(int i=0;i<listExpense.size();i++){
				Expense exp=listExpense.get(i);
				String categoryName=getCategoryNameById(exp.getCategoryId());
				map.put(categoryName, listExpense.get(i));
			}
			model.addObject("list",map);
			model.addObject("msg","Expense not deleted..Try Again..!!!");
			return model;
		}
		

	}
	
	@RequestMapping(value="/reportCategory.htm", method=RequestMethod.GET)
	 public ModelAndView reportCategory(HttpServletRequest request,HttpServletResponse response){
		
		Integer userId=(Integer) session.getAttribute("userid");
		List<Expense> list=new ArrayList<Expense>();
		Map<String,Integer> map=new TreeMap<String, Integer>();
		
		list=ExpenseService.reportCategoryWise(userId);
		
		for(int i=0;i<list.size();i++){
			Expense exp=list.get(i);
			String categoryName=getCategoryNameById(exp.getCategoryId());
			
			if(map.containsKey(categoryName)){
				Integer total=map.get(categoryName);
				total=total+exp.getAmount();
				map.put(categoryName, total);
			}
			else{
				map.put(categoryName, exp.getAmount());
			}
		}
		
		ModelAndView model=new ModelAndView("reportCategory");
		model.addObject("mapTotal",map);
		return model;
		
		
	}
	
	
	@RequestMapping(value="/reportYearly.htm", method=RequestMethod.GET)
	 public ModelAndView reportYearly(HttpServletRequest request,HttpServletResponse response){
		
		Integer userId=(Integer) session.getAttribute("userid");
		List<Expense> list=new ArrayList<Expense>();
		Map<String,Integer> map=new TreeMap<String, Integer>();
		
		list=ExpenseService.reportCategoryWise(userId);
		
		for(int i=0;i<list.size();i++){
			Expense exp=list.get(i);
			String date=exp.getDate();
			String year=date.substring(0, 4);
			
			if(map.containsKey(year)){
				Integer total=map.get(year);
				total=total+exp.getAmount();
				map.put(year, total);
			}
			else{
				map.put(year, exp.getAmount());
			}
		}
		
		ModelAndView model=new ModelAndView("reportYearly");
		model.addObject("mapTotal",map);
		return model;
		
		
	}
	
	@RequestMapping(value="/reportMonthly.htm", method=RequestMethod.GET)
	 public ModelAndView reportMonthly(HttpServletRequest request,HttpServletResponse response){
		
		Integer userId=(Integer) session.getAttribute("userid");
		List<Expense> list=new ArrayList<Expense>();
		Map<String,Integer> map=new TreeMap<String, Integer>();
		
		list=ExpenseService.reportCategoryWise(userId);
		
		for(int i=0;i<list.size();i++){
			Expense exp=list.get(i);
			String date=exp.getDate();
			String yearMonth=date.substring(0, 7);
			
			if(map.containsKey(yearMonth)){
				Integer total=map.get(yearMonth);
				total=total+exp.getAmount();
				map.put(yearMonth, total);
			}
			else{
				map.put(yearMonth, exp.getAmount());
			}
		}
		
		ModelAndView model=new ModelAndView("reportMonthly");
		model.addObject("mapTotal",map);
		return model;
		
		
	}
}
	

