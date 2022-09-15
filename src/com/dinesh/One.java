package com.dinesh;

public class One {
	int a,b;
	
	One(){
		System.out.println("Empty Constructor");
	}
	
	One(int a){
		this(); //this will call empty constructor
		System.out.println("Parameterized Constructor"+a);
	}
	One(int a,int b){
		this(a);//call the 1 parameter constructor
		System.out.println("two paratmeterized constructor "+a+b);
		show(this);
	}

 void show(One o) {
		System.out.println(this.a+" "+this.b);
	}
}
