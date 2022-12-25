package threadsdemo;

public class ThreadPrioritydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread mt1 = new Mythread();
		mt1.setName("Thread1");

		Mythread mt2 = new Mythread();
		mt2.setName("Thread2");

		Mythread mt3 = new Mythread();
		mt3.setName("Thread3");

		mt1.setPriority(Thread.MAX_PRIORITY);
//		mt2.setPriority(Thread.NORM_PRIORITY);
//		mt3.setPriority(Thread.MIN_PRIORITY);

		mt1.start();
		mt2.start();
		mt3.start();

//		Thread.currentThread().setPriority(8);
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
	}

}
