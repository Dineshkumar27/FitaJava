package innerclass;

public class AnnonymousInnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("this is annonymous class");
			}
		};

		Thread t = new Thread(r);
		t.start();
		
		Integer
	}

}
