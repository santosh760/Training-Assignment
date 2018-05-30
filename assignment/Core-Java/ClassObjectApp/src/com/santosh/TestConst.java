package com.santosh;

class DogConst{
	 int age;
	 String name;
	
	 public DogConst() {
		System.out.println("Default constructor is called...");
	}
	 
	 public DogConst(int a, String n) {
		 System.out.println("Parameterized constructor is called...");
		age = a;
		name = n;
	}



	public void eat(){
			System.out.println("Dog is Eating having Name and Age "+age+" "+name);
		}
}

public class TestConst {

	public static void main(String[] args) {
		DogConst d1=new DogConst();
		d1.eat();

		DogConst d2=new DogConst(10, "Tommy");
		d2.eat();
	}

}
