package com.santosh.fordemo;

public class ForDemo {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=10;i++){
			System.out.println(i);
			if(i%2==0){
				sum=sum+i;
			}
		}
		System.out.println("Sum of Even Number is: "+sum);

	}

}
