package abstraction;

public class RegularCustomer extends Customer {

	public RegularCustomer() {
		totalAmount = 100;
		discount = 0;

	}

	@Override
	void calculateBill() {
		billAmount = totalAmount - (discount * totalAmount);
	}

	public void show() {
		System.out.println("Show");
	}
}
