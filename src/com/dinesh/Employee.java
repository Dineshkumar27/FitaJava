package com.dinesh;

public class Employee {
//instance variable
	private int empid;// 0
	private String name;// null
	private String address;// null
	private double salary;// 0.0

	public Employee() {
		empid = 101;
		name = "Neena";
		address = "Hyderabad";
		salary = 90000;
	}

	public Employee(int empid, String name, String address, double salary) {
		this.empid = empid;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public void printEmployeeDetails() {// method
		System.out.println(empid + " " + name + " " + " " + address + " " + salary);
	}

	// toString is to print the details inside the object
	// toString in Object class will be called when you print object in SOP
	// it can be overrided by defining toString in Employee class
//	@Override
//	public String toString() {
//		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
//	}

}
