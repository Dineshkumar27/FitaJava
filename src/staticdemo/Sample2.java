package staticdemo;

public class Sample2 {

	static int studentId = 10;

	public Sample2() {
		++studentId;
	}

	static {
		System.out.println("Static Block");
	}
}
