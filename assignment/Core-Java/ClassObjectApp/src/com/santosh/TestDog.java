package com.santosh;

class Dog{
	private int age;
	
	public void eat(){
		System.out.println("Dog is Eating having age "+age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		if(a>0){
		age = a;
		}
		else{
			String msg="Worng value for age";
			throw new IllegalArgumentException(msg);
		}
	}
	
	
}

public class TestDog {

	public static void main(String[] args) {
		Dog d1=new Dog();
		//d1.setAge(-10);
		d1.setAge(10);
		d1.eat();
		System.out.println("Age= "+d1.getAge());

	}

}
