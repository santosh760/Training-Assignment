package com.santosh;

class DogDemo{
	 int age=10;
	 
	 public void eat(){
			System.out.println("Dog is Eating having age "+age);
		}
}

public class TestDemo {

	public static void main(String[] args) {
		DogDemo d1=new DogDemo();
		d1.eat();
		
		DogDemo d2=new DogDemo();
		d2.age=20;
		d2.eat();

	}

}
