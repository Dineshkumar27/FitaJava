package threadsdemo;

public class CreatingThread {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();// to get the details of the currently running thread
		System.out.println(t.getName());
		System.out.println(t);
		System.out.println(t.getPriority());

	}

}
