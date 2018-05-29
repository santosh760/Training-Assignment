package com.santosh.stringdemo;

public class StrBuilderOperation {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Santosh Pandey");
		
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(5));
		System.out.println(sb.append(" Trainee"));
		System.out.println(sb.delete(7, 14));
		System.out.println(sb.replace(7, 15, " Pandey"));
		System.out.println(sb.reverse());
		System.out.println(sb.replace(0, 15, "Santosh Pandey"));

	}

}
