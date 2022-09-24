package exceptionsdemo;

import java.io.IOException;

public class Exc {

	static void method() throws IOException {
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		int arr[] = { 11, 22 };

		try {
			System.out.println(a / b);
			arr[10] = 90;
			method();
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println(aiobe.getMessage());
			System.out.println(aiobe.getClass());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
		System.out.println("End of the program");
	}

}
