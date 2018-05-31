package com.santosh;

class Addition{
	
	public void add(int a,int b){
		
		System.out.println("----int---int---"+(a+b));
	}
	
	public void add(int a,float b){
		
		System.out.println("----int---float---"+(a+b));
	}
	public void add(float a,int b){
		
		System.out.println("----float---int---"+(a+b));
	}
	public void add(float a,float b){
	
	System.out.println("----float---float---"+(a+b));
}
}

public class TestMethodOverloading {

	public static void main(String[] args) {
		Addition a = new Addition();
		
		a.add(10, 20);
		a.add(10, 20f);
		a.add(20f, 10);
		a.add(20f, 20f);

	}

}
