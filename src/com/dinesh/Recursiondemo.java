package com.dinesh;

public class Recursiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}

	public static int factorial(int n) {

		if (n == 0 || n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

}
