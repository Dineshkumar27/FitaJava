package exceptionsdemo;

import java.io.IOException;

public class Exc {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int arr[] = { 4, 9, 3 };

		try {
			System.out.println(a / b);// dividing by zero
			arr[7] = 90;// 7 is out of bound for index 2
			method();
		} catch (ArrayIndexOutOfBoundsException aiobe) {
//			ae.printStackTrace();// will give output like error in red color
			System.out.println(aiobe.getMessage());// print output like output text
		} catch (ArithmeticException ae) {
//			ae.printStackTrace();
			System.out.println(ae.getMessage());
		} catch (Exception e) {
			// this is super class for all Exception, and it will handle subclass Exceptions
			System.out.println(e.getMessage());
		} finally {
			System.out.println("I am Finally Block");
		}

		System.out.println("End of Program");
	}

	static void method() throws IOException {
		System.out.println("Hello");
	}

}
