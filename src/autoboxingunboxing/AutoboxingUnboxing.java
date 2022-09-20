package autoboxingunboxing;

public class AutoboxingUnboxing {

	public static void main(String[] args) {

		// Autoboxing
		int a = 10;// primitive type
		Integer A = new Integer(a);// Explicity converting
		System.out.println(a);
		System.out.println(A);

		Integer B = a;
		System.out.println(B);

		// Unboxing
		Integer x = 890;// Wrapper class
		int i = x;// unboxing
		System.out.println(i);

	}

}
