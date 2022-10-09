public class DiwaliDiscount {

	public static void main(String[] args) {

//		System.out.println("Enter number of customer");
//		Scanner scanner = new Scanner(System.in);
//		int size = scanner.nextInt();
//		int billsArray[] = new int[size];
		System.out.println("Enter bills of customers");
//		String bills = scanner.nextLine();
		String bills = "120 101 145 95 180 170";
		String billsSplit[] = bills.split(" ");
		int billsInteger[] = new int[billsSplit.length];
		for (int i = 0; i < billsSplit.length; i++) {
			billsInteger[i] = Integer.parseInt(billsSplit[i]);
		}
		int count = 0;
		for (int bill : billsInteger) {
			if (bill > 150) {
				++count;
			}

		}
		System.out.println(count + "customers are eligible for discount");

	}

}
