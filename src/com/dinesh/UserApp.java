package com.dinesh;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User();// calls empty constructor
//		System.out.println(user1.getUserId());
//		System.out.println(user1.getUserName());
//		System.out.println(user1.getUserType());
		System.out.println();
		User user2 = new User(90);// calls constructor with one parameter
//		System.out.println(user2.getUserId());
//		System.out.println(user2.getUserName());
//		System.out.println(user2.getUserType());
		User user3 = new User(101, "Hari", "Privileged");

//		System.out.println(user3.getUserId());
//		System.out.println(user3.getUserName());
//		System.out.println(user3.getUserType());

		// object
//		classname objectname=new classname();
		user1.printUserDetails();
		user2.printUserDetails();
		user3.printUserDetails();

	}

}
