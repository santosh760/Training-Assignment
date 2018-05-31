package com.santosh.fdpe;

public class Test {

	public static void main(String[] args) {
		Factory factroy=new Factory();
		
		Details d=factroy.getDetail("employee");
		
		d.showDetails();

	}

}
