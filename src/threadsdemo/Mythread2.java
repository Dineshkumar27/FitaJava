package threadsdemo;

public class Mythread2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("i=" + i);
			} catch (InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}

	}

}