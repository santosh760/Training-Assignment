package com.santosh;

class Employee{
	int id;
	String name;
	
	public Employee(int eid, String ename) {
		id = eid;
		name = ename;
	}



	void doTask(){
		System.out.println("Employee id= "+id+" Employee Name= "+name);
	}
}

public class TestObjetArray {

	public static void main(String[] args) {
		
		Employee[] emps=new Employee[3];
		emps[0]=new Employee(1, "Santosh");
		emps[1]=new Employee(2, "mantosh");
		emps[2]=new Employee(3, "Santy");
		
		for (Employee e:emps) {
			e.doTask();
		}

	}

}
