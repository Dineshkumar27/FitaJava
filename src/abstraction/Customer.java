
package abstraction;

public abstract class Customer {

	protected float discount;
	protected float totalAmount;
	protected double billAmount;

	abstract void calculateBill();

	public void printTotalBillAmount() {
		System.out.println("bill amount is " + billAmount);
	}

}
