package com.santosh;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used as Database/Repository and its a singleton
 * @author Santosh Pandey
 *
 */
public class Repositoy {
	
	/**
	 * List of Expense
	 */
	public List<Expense> expList=new ArrayList<>();
	
	/**
	 * List of Category
	 */
	public List<Category> catList=new ArrayList<>();
	
	private static Repositoy repository;
	
	private Repositoy() {
		
	}

	/**
	 * This method will provide instance of repository object
	 * @return instance of Repositoy
	 */
	public static Repositoy getRepository(){
		
		if(repository==null){
			repository=new Repositoy();
		}
		
		return repository;
	}
}
