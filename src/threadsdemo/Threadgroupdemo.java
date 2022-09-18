package threadsdemo;

public class Threadgroupdemo {

	public static void main(String[] args) {

		Mythread2 mt = new Mythread2();
		ThreadGroup tg1 = new ThreadGroup("MyFita");
		Thread t1 = new Thread(tg1, mt, "First");
		Thread t2 = new Thread(tg1, mt, "Second");
		Thread t3 = new Thread(tg1, mt, "Third");

		t1.start();
		t2.start();
		t3.start();
		System.out.println(tg1);
		System.out.println();
		tg1.list();

	}

}
