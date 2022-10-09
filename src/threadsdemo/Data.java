package threadsdemo;

public class Data {

	synchronized void print(int a) {

		for (int i = 0; i < 5; i++) {
			System.out.println(a);
Hashtable
		}
	}
}

class SevenThread extends Thread {
	Data d;

	public SevenThread(Data ref) {
		d = ref;
	}

	public void run() {
		d.print(7);
	}
}

class SixThread extends Thread {
	Data d;

	public SixThread(Data ref) {
		d = ref;
	}

	public void run() {
		d.print(6);
	}
}

class FiveThread extends Thread {
	Data d;

	public FiveThread(Data ref) {
		d = ref;
	}

	public void run() {
		d.print(5);
	}

}