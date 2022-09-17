package exceptionsdemo;

public class UserdefinedExceptondemo {

	public static void main(String[] args) throws Minorexception {
		// TODO Auto-generated method stub

		
		int age=17;
		if(age<18) {
			throw new Minorexception("Cannot vote");
		}
	}

}
