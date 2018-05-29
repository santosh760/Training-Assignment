package com.santosh.stringdemo;

public class MutableString {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello");
		
		System.out.println(sb);
		
		System.out.println(sb.hashCode());
		
		System.out.println(sb.append("Friend"));
		
		System.out.println(sb.hashCode());

	}

}
