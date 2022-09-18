package threadsdemo;

public class Synchronizationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();

		SevenThread seven = new SevenThread(data);
		SixThread six = new SixThread(data);
		FiveThread five = new FiveThread(data);

		seven.start();
		six.start();
		five.start();
	}

}
