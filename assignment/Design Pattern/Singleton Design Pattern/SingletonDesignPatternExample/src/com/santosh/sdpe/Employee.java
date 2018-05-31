package com.santosh.sdpe;

public class Employee {

	private int id;
	private String name;
	private int salary;
	
	private static Employee instance = new Employee();
	
	private Employee() {
		id=101;
		name="santosh";
		salary=120000;
	}
	
	public static Employee getIstance(){
		return instance;
	}
	
	public void showDetails(){
	      System.out.println("Employee ID - "+id);
	      System.out.println("Employee Name - "+name);
	      System.out.println("Employee Salary - "+salary);
	   }
}
