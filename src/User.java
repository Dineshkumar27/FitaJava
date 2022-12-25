
public class User {
	// variables
	private String firstName;
	private int age;

	// method
	public void showUserData() {
		System.out.println("User name " + firstName + " " + "age is " + age);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// method with return

	public int squareIt(int a) {
		return a * a;
	}

	public String getUserId(String name, int age) {
		return name + age;
	}
}
