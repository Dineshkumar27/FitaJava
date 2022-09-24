
package abstraction;

public abstract class Customer {

	protected float discount;
	protected float totalAmount;
	protected double billAmount;

	abstract void calculateBill();

	// non abstract method
	public void printTotalBillAmount() {
		System.out.println("bill amount is " + billAmount);
	}

}
