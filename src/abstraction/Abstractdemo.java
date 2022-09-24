package abstraction;

public class Abstractdemo {

	public static void main(String[] args) {

//		RegularCustomer rcustomer = new RegularCustomer();
//		PriviledgedCustomer prcustomer = new PriviledgedCustomer();
//		rcustomer.calculateBill();
//		prcustomer.calculateBill();
//
//		rcustomer.printTotalBillAmount();// 100
//		prcustomer.printTotalBillAmount();// 90

//		Customer customer;// super class reference
//		
		Customer customer = new RegularCustomer();// runtime polimorphism
		customer.calculateBill();// call the regular customer calculate bill
		customer.printTotalBillAmount();
//		customer.show();// cannot call derived class specific method using base class reference
////	    
////	    
		customer = new PriviledgedCustomer();
		customer.calculateBill();// call the priviledged customer calculate bill
		customer.printTotalBillAmount();

	}

}
