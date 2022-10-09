package multipleinheritance;

public class FunctionalInterfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conventional c = new Conventional();
		c.add(8, 9);
		Arithmetic ar = (a, b) -> a + b;

		System.out.println(ar.add(8, 9));
	}

}
