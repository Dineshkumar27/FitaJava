package singleinheritance;

public class GSTBilling extends Billing {

	public GSTBilling(double amount) {
		this.amount = amount;
	}

	public double calculateBill() {

		this.totalBill = amount + (amount * 0.18);

		return totalBill;

	}

}