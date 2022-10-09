package innerclass;

public class AnnonymousInnerclass {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Annonymous Class");

			}
		};

		Thread t = new Thread(r);
		t.start();

		Hello hello = new Hello() {

			@Override
			public void greet() {
				// TODO Auto-generated method stub
				System.out.println("Welcome to Fita");
			}
		};

		hello.greet();
	}

}
