package com.santosh;

public class Test {

	public static void main(String[] args) {
		
		Employee e=new Employee(101, "Santosh");
		EmployeeService service=new EmployeeService();
		service.save(e);
		Employee emp=service.getEmployee();
		System.out.println("---get---"+emp.getId()+" "+emp.getName());

	}

}
