package com.santosh.stringdemo;

public class ImmString {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2=new String("Friend");
		
		System.out.println(s1+" Having Hash Code "+s1.hashCode());
		
		s1=s1+s2;
		
		System.out.println(s1+" Having Hash Code "+s1.hashCode());

	}

}
