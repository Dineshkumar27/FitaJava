package exceptionsdemo;

import java.io.IOException;

public class Exc {

	public static void main(String[] args) throws ArithmeticException, Exception {
		int a = 1;
		int b = 1;
		int arr[] = { 11, 44 };
		System.out.println(a / b);
		arr[10] = 89;

		myMethod();

		System.out.println("End of the program");

	}

	static void myMethod() throws IOException {
		throw new IOException("IO Exception has been thrown");
	}
}
