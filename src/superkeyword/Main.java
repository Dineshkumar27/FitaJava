package superkeyword;

public class Main {

	public static void main(String[] args) {
		Child child = new Child("XYZ", 32, "Chennai");// calls empty constructor
		child.callShow();
		child.printChildDetails();
		child.printParentDetails();

	}

}
