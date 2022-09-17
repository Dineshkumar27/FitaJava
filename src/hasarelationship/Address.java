package hasarelationship;

public class Address {
	
	int doorNo;
	String street;
	public Address(int doorNo, String street) {
		super();
		this.doorNo = doorNo;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + 
	doorNo + ", street=" + street + "]";
	}
	
	

}
