package threadsdemo;

public class Mythread extends Thread {
	// will be called when we start Thread
	public void run() {
		for (int i = 0; i < 2; i++) {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				System.out.println(ie.getMessage());
			}

			System.out.println(Thread.currentThread().getName() + " " + i);

		}
	}

}
