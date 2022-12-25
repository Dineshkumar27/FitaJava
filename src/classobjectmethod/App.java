package classobjectmethod;

public class App {
	public static void main(String[] args) {

		User user = new User();

//		user.printDetails();// num1=10 num2=20
////		user.updateVariable();//calling method
//		user.printDetails();// num1=11 num2=21
//
//		Employees emp = new Employees();
//		emp.printEmployeeDetails();
//
//		// getting input from user
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your salary to check the eligibility");
//		int salary = scanner.nextInt();
//
//		boolean result = user.loanEligibilityCheck(salary);
//		if (result) {
//			System.out.println("Sanction Loan");
//		} else {
//			System.out.println("Try later");
//		}
//		

//		user.add();
//		user.add(8, 9);
//		user.add(8.7f, 8.9f);
//		System.out.println(user.add(4.5, 6.7));
//		double val = user.add(9.9, 1.1);
//		System.out.println("Answer is " + val);

		Sample sample = new Sample(785, "Delhi", "Karunya");// object of class Sample

		System.out.println(sample.getId() + " " + sample.getName() + " " + sample.getAddr());

		Sample sample2 = new Sample(786, "Chennai", "Sithik");

		System.out.println(sample2.getId() + " " + sample2.getName() + " " + sample2.getAddr());

	}

}
