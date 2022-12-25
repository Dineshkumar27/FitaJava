package com.dinesh;

import java.util.Scanner;

public class Gettinguserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object for Scanner class
		// Shift+ctrl+o-> for auto import
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Age");
		int age = scanner.nextInt();
		System.out.println("Enter your Name");
		String name = scanner.next();
		System.out.println(name + " at his age " + (age + 10));
		scanner.close();
	}

}
