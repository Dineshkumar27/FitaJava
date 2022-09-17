package com.dinesh;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User(891, "Bhuvanesh", "REgular");// object for User
		User user2 = new User(898, "Kaavin", "Super User");// object for User2

		// setting values
//		user.setUserId(109);
//		user.setUserName("Manish");
//		user.setUserType("free user");

//		System.out.println("UserId " + user.getUserId() + " " + "username " + user.getUserName() + " " + "userType "
//				+ user.getUserType());

		user.printUserDetails();
		user2.printUserDetails();

	}

}
