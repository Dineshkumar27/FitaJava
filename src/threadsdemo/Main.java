package threadsdemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Mythread mt = new Mythread();// is a Thread object
//		mt.setName("Fita");
////		// this will call run method inside the Mythread class
//		mt.start();
//		System.out.println(mt.getName());
//		System.out.println(mt);

		// created Thread using Runnable interface
//
		Mythread2 mt2 = new Mythread2();// normal object

		// convert the above object to Thread object
		Thread t = new Thread(mt2, "Fita1");
		Thread t2 = new Thread(mt2, "Fita2");

		t.start();// call the run method in Mythread2 class
		t2.start();
//		System.out.println(Thread.currentThread().getName());
	}

}
