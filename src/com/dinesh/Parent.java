package com.dinesh;

public class Parent {
	String name;
	int age;
	
	public Parent(String name, int age) {
		System.out.println("Super class constructor called");
		this.name = name;
		this.age = age;
	
	}

	
	
	public void show() {
		System.out.println("Show method");
	}

}
