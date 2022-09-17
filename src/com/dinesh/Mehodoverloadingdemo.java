package com.dinesh;

public class Mehodoverloadingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample = new Sample();
		sample.add();
		sample.add(8, 9);
		sample.add(8.9f, 4.5f);
		double result = sample.add(89.7, 78.6);
		System.out.println(result);
	}

}
