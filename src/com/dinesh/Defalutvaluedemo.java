package com.dinesh;

public class Defalutvaluedemo {

	int num1 = 10;// instance variable
	boolean b;

	public static void main(String[] ar) {
//		int a = 10;
//		System.out.println("a=" + a);
//		Defalutvaluedemo obj = new Defalutvaluedemo();// object
//		System.out.println("num1=" + obj.num1);
//		System.out.println("B=" + obj.b);

		System.out.println(ar[0] + " " + ar[1] + " " + ar[2]);
		int val1 = Integer.parseInt(ar[0]);
		int val2 = Integer.parseInt(ar[1]);
		System.out.println("Addition= " + (val1 + val2));

	}

}
