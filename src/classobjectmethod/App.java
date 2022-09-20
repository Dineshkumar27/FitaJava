package classobjectmethod;

public class App {
	public static void main(String[] args) {

		User user = new User();
		user.printDetails();// num1=10 num2=20
//		user.updateVariable();
		user.printDetails();// num1=11 num2=21

		Employees emp = new Employees();
		emp.printEmployeeDetails();
	}

}
