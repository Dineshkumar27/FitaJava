package com.dinesh;

public class Main {

	public static void main(String[] args) {
		// creating object for Employee class

		Employee emp = new Employee();// this will call 1st constructor
		emp.printEmployeeDetails();
////		emp.setEmpid(100);
////		emp.setName("Alice");
////		emp.setSalary(70000);
////		emp.setAddress("Chennai");
//		
//		
////		System.out.println(emp.getEmpid()+" "+emp.getName()+" "+emp.getSalary()+" "+emp.getAddress());
//		
		Employee emp2 = new Employee(102, "Nancy", "Mumbai", 89000);// this will call constructor
		Employee emp3 = new Employee(102, "Steven", "Bangalore", 81000);
//		
////		emp2.setEmpid(101);
////		emp2.setName("Bob");
////		emp2.setSalary(72000);
////		emp2.setAddress("Delhi");
//		
		emp2.printEmployeeDetails();
		emp3.printEmployeeDetails();
////		System.out.println(emp2.getEmpid()+" "+emp2.getName()+" "+emp2.getSalary()+" "+emp2.getAddress());
////		
//////		emp2.name="Nancy";
////		
////		System.out.println(emp2.getEmpid()+" "+emp2.getName()+" "+emp2.getSalary()+" "+emp2.getAddress());
//
//		
//		
//		System.out.println(emp);//this will call toString() method from Object if not defined in Employee class
//        System.out.println(emp2);//if toString() is defined in Employee class, then that will be called
//        
//        System.out.println(emp3);

//		One one=new One(7,8);//this will call two parameterized constructor

//		Child obj = new Child("MNP", 39, "Chennai");
//		obj.print();
//		System.out.println(obj);

	}

}
