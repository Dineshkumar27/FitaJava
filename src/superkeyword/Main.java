package superkeyword;

public class Main {

	public static void main(String[] args) {
		Child child=new Child();//calls empty constructor
		child.callShow();
		
		Child child2=new Child("MNP",28,"Chennai");
		child2.printChildDetails();

	}

}
