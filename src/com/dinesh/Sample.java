package com.dinesh;

public class Sample {

	int num1 = 10, num2 = 20;

	public void add() {
		System.out.println("add() " + (num1 + num2));
	}

	public void add(int a, int b) {
		System.out.println("add(int a, int b) " + (a + b));
	}

	public void add(float val1, float val2) {
		System.out.println("add(float a, float b) " + (val1 + val2));
	}

	public double add(double val1, double val2) {
		System.out.println("add(double a, double b) ");
		return val1 + val2;
	}

}
