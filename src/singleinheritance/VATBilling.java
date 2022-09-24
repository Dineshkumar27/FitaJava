package singleinheritance;

public class VATBilling extends Billing {

	public VATBilling(double amount) {
		this.amount = amount;
	}

	public double calculateBill() {

		this.totalBill = amount + (amount * 0.02);
		return totalBill;
	}

}
