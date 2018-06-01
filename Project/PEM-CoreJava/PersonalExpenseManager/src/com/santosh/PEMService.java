package com.santosh;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * This class will provide all service method for PEM
 * @author Santosh Pandey
 *
 */
public class PEMService {
	
	Repositoy repo=Repositoy.getRepository();
	
	private Scanner in=new Scanner(System.in);
	private int choice;
	
	/**
	 * This method will display the Menu
	 */
	public void showMenu(){
		
		while (true){
			printMenu();
			
			switch (choice) {
			
			case 1:
					onAddCategory();
					pressAnyKeyToCountinue();
				break;
			
			case 2:
				onCategoryList();
				pressAnyKeyToCountinue();
			break;
			
			case 3:
				onExpenseEntry();
				pressAnyKeyToCountinue();
			break;
			
			case 4:
				onExpenseList();
				pressAnyKeyToCountinue();
			break;
			
			case 5:
				onReportMonthly();
				pressAnyKeyToCountinue();
			break;
			
			case 6:
				onReportYearly();
				pressAnyKeyToCountinue();
			break;
			
			case 7:
				onReportCategoryWise();
				pressAnyKeyToCountinue();
			break;
			
			case 0:
					System.exit(0);
					break;
					
			default:
					System.out.println("Invalid Entry");
				break;
			}
		}
	}
	
	public void printMenu(){
		System.out.println("---------PEM Application---------");
		System.out.println("1. Add Category");
		System.out.println("2. Category List");
		System.out.println("3. Expense Entry");
		System.out.println("4. Expense List");
		System.out.println("5. Report --Monthly");
		System.out.println("6. Report --Yearly");
		System.out.println("7. Report --Category Wise");
		System.out.println("0. Exit");
		System.out.println("----------------------------------");
		System.out.print("Enter Your Choice : ");
		choice=in.nextInt();
	}

	public void onAddCategory(){
		in.nextLine();
		System.out.print("Enter Category Name :");
		String catName=in.nextLine();
		Category cat=new Category(catName);
		repo.catList.add(cat);
		System.out.println("Category Name Added...");
		
	}
	
	public void onCategoryList(){
		System.out.println("Category List");
		List<Category> category=repo.catList;
		for(int i=0;i<category.size();i++){
			Category c=category.get(i);
			System.out.println((i+1)+" "+ c.getName()+" "+c.getCategoryId());
		}
		
	}
	
	public void onExpenseEntry(){
		System.out.println("Expense Entry...");
	}
	
	public void onExpenseList(){
		System.out.println("Expense Listing...");
	}
	
	public void onReportMonthly(){
		System.out.println("Monthly Reporting...");
	}
	
	public void onReportYearly(){
		System.out.println("yearly Reporting..");
	}
	
	public void onReportCategoryWise(){
		System.out.println("Category Wise Reporting...");
	} 
	
	public void pressAnyKeyToCountinue(){
		System.out.println("Press any key to countinue");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
