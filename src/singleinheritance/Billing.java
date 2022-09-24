package singleinheritance;

public class Billing {

	double amount;
	double tax;
	double totalBill;

	public double calculateBill() {

		totalBill = amount + (amount * tax);
		return totalBill;
	}

}
