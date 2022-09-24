package singleinheritance;

public class SingleInheritancedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bike bike = new Bike();// call the Bike class Constructor
//		bike.printVehicleDetails();// calls from the Parent class Vehicle

		GSTBilling gst = new GSTBilling(8000);
		System.out.println(gst.calculateBill());

		VATBilling vat = new VATBilling(8000);
		double result = vat.calculateBill();
		System.out.println(result);
	}

}
