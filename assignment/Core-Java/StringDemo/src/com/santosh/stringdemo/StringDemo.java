package com.santosh.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="hello";
		String s2=new String("hello");
		char[] arr=new char[]{'h','e','l','l','o'};
		String s3=new String(arr);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		String s4=s2;
		
		System.out.println(s4);
		System.out.println(s4==s2);
		System.out.println(s4.equals(s2));

	}

}
