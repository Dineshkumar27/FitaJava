package abstraction;

public class PriviledgedCustomer extends Customer {

	public PriviledgedCustomer() {
		discount = 0.1f;
		totalAmount = 100;
	}

	@Override
	void calculateBill() {
		billAmount = totalAmount - (discount * totalAmount);
	}

}
