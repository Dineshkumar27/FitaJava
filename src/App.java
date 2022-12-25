
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Classname objename=new Classname();

		User user1 = new User();
		// setting value of the user1 using setter method
		user1.setFirstName("Jagan");
		user1.setAge(45);
		user1.showUserData();
		// getting value of the user1 using getter method
		System.out.println(user1.getFirstName() + "-" + user1.getAge());
		User user2 = new User();
		System.out.println();// create one empty line

		System.out.println("USER 2 Data");
		// setting value of the user2 using setter method
		user2.setFirstName("Hari");
		user2.setAge(35);
		// getting value of the user2 using getter method
//		user2.showUserData();
		System.out.println(user2.getFirstName() + "-" + user2.getAge());

	}

}
