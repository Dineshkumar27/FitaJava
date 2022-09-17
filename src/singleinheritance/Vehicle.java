package singleinheritance;

public class Vehicle {
	protected int noOfWheels;
	protected String engineType;

	public void printVehicleDetails() {
		System.out.println("No of wheels " + noOfWheels);
		System.out.println("Engine Type " + engineType);
	}

}
