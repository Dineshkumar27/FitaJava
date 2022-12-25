package com.dinesh;

public class User {

	int userId;
	private String userName;
	private String userType;

	public User() {
		this.userId = 890;
		this.userName = "Jagan";
		this.userType = "Regular";
	}

	public User(int userId, String userName, String userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserType() {
		return userType;
	}

	public void printUserDetails() {
		System.out.println(
				"UserId " + getUserId() + " " + "username " + getUserName() + " " + "userType " + getUserType());
	}

}
