package threadsdemo;

public class Joindemo {
	public static void main(String[] args) {

		Mythread mt1 = new Mythread();
		Mythread mt2 = new Mythread();
		Mythread mt3 = new Mythread();
		mt1.setName("Thread 1");
		mt2.setName("Thread 2");
		mt3.setName("Thread 3");
		mt1.start();

		try {
			System.out.println("current Thread " + Thread.currentThread().getName());
			mt1.join();
		} catch (Exception ie) {
			System.out.println(ie);
		}

		mt2.start();

		try {
			System.out.println("current Thread " + Thread.currentThread().getName());
			mt2.join();
		} catch (Exception ie) {
			System.out.println(ie);
		}

		mt3.start();
		try {
			System.out.println("current Thread " + Thread.currentThread().getName());
			mt3.join();
		} catch (Exception ie) {
			System.out.println(ie);
		}
		System.out.println(mt1.isAlive());
		System.out.println(mt2.isAlive());
		System.out.println(mt3.isAlive());

	}
}
