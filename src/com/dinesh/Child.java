package com.dinesh;

public class Child extends Parent {
	String name;
	int age;
	String addr;
	public Child(String name, int age, String addr) {
		super(name,age);//this line will call super class construction
		this.name = name;
		this.age = age;
		this.addr=addr;
	}

	
	
	public void print() {
//		System.out.println(super.num1);
		super.show();
	}



	@Override
	public String toString() {
		return "Child [name=" + name + ", age=" + age + "]";
	}
	
	

}
