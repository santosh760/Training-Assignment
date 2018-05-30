package com.santosh;

public class EmployeeService {
	
	public void save(Employee emp){
		
		System.out.println("-----save----"+emp.getId()+"  "+emp.getName());
	}
	
	public Employee getEmployee(){
		Employee e=new Employee(1,"santy");
		return e;
	}

}
