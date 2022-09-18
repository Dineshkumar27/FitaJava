package threadsdemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Mythread mt = new Mythread();// is a Thread object
//		mt.setName("Fita");
//		mt.start();// this will call run method inside the Mythread class
//		System.out.println(mt);
		// created Thread using Runnable interface
//
		Mythread2 mt2 = new Mythread2();
		// convert the above object to Thread object
		Thread t = new Thread(mt2, "Mythread2");
		t.start();// call the run method in Mythread2 class
		System.out.println(Thread.currentThread().getName());
	}

}
