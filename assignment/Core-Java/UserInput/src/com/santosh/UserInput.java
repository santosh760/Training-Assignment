package com.santosh;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.next();
		System.out.println("Enter your age");
		int age= sc.nextInt();
		
		String place=JOptionPane.showInputDialog("Enter your place");
		
		System.out.println("Name - "+name);
		System.out.println("Age - "+age);
		System.out.println("Place -"+place);

	}

}
