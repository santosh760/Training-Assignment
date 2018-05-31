package com.santosh;


class Animal{
	
	private String name;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name=name;
	}

	public void eat(){
		System.out.println("Animal is eating...."+name);
	}
	
	public void run(){
		System.out.println("Animal is running...."+name);
	}
}

class Dog extends Animal{
	
	private int age;
	
	public Dog() {
		super();
	}
	
	public Dog(int age,String name) {
		super(name);
		this.age=age;
	}
	public void bark(){
		System.out.println("Dog is barking...");
	}
	
}

class Cat extends Animal{
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String name) {
		super(name);
	}

	public void bite(){
		System.out.println("Cat is biting...");
	}
	
}

public class TestInheritance {

	public static void main(String[] args) {
		Dog d=new Dog(12,"tommy");
		d.eat();
		d.eat();
		d.bark();
		
		System.out.println();
		
		Cat c=new Cat("kitty");
		c.eat();
		c.run();
		c.bite();

	}

}
