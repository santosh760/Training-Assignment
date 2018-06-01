package com.santosh;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class will help to maintain report
 * @author Santosh Pandey
 *
 */
public class ReportService {

	private Repositoy repo=Repositoy.getRepository();
	
	/**
	 * This method will calculate monthly expense
	 * @return Map of data
	 */
	public Map<String,Float> calculateMonthlyTotal(){
		Map<String,Float> map= new TreeMap<>();
		for(Expense exp: repo.expList){
			Date expDate=exp.getDate();
			String yearMonth=DateUtil.getYearAndMoth(expDate);
			if(map.containsKey(yearMonth)){
				Float total=map.get(yearMonth);
				total=total+exp.getAmount();
				map.put(yearMonth, total);
			}
			else {
				map.put(yearMonth, exp.getAmount());
			}
		}
		return map;
	}
	
	/**
	 * This method will calculate yearly expense
	 * @return Map of data
	 */
	public Map<Integer,Float> calculateYearlyTotal(){
		Map<Integer,Float> map= new TreeMap<>();
		for(Expense exp: repo.expList){
			Date expDate=exp.getDate();
			Integer year=DateUtil.getYear(expDate);
			if(map.containsKey(year)){
				Float total=map.get(year);
				total=total+exp.getAmount();
				map.put(year, total);
			}
			else {
				map.put(year, exp.getAmount());
			}
		}
		return map;
	}
	
	/**
	 * This method will calculate category wise expense
	 * @return Map of data
	 */
	public Map<String,Float> calculateCategorizedTotal(){
		Map<String,Float> map= new TreeMap<>();
		for(Expense exp: repo.expList){
			Long categoryID=exp.getCategoryId();
			String catName=this.getCategoryNameById(categoryID);
			if(map.containsKey(catName)){
				Float total=map.get(catName);
				total=total+exp.getAmount();
				map.put(catName, total);
			}
			else {
				map.put(catName, exp.getAmount());
			}
		}
		return map;
	}
	
	/**
	 * This method will to get category name by id
	 * @param CategoryId
	 * @return Name of Category
	 */
	public String getCategoryNameById(Long CategoryId){
		for(Category c:repo.catList){
			if(c.getCategoryId().equals(CategoryId)){
				return c.getName();
			}
			
		}
		return null;
	}
}
