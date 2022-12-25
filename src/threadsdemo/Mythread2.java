package threadsdemo;

public class Mythread2 implements Runnable {

	@Override
	public void run() {
		// this will give Which Thread is currently executing the run() method
		System.out.println(Thread.currentThread().getName());

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "i=" + i);
			} catch (InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}

	}

}
