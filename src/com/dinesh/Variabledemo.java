package com.dinesh;

public class Variabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		String name = "Dinesh";
		float average = 9.8f;
		double grade = 7.8;
		long phoneNumber = 9090909090L;

		System.out.println("Num1 " + num1);
		System.out.println("name" + name);
		System.out.println("average" + average);
		System.out.println("grade" + grade);

		// typecasting-broading and narrowing(Implicit and explicit typecasting)
		// implicit convertion small datatype to large datatype
		// explicit convertion large datatype to small datatype

		float num1Float = num1;
		System.out.println("converted num1" + num1Float);
		long num1long = num1;
		System.out.println("converted num1" + num1long);

		int longphoneNumber = (int) phoneNumber;
		System.out.println("Converted Long" + longphoneNumber);
//           
//           int num2=(int)"10";
//		int num2 = true;

//		boolean b =(boolean) 10;
//           

		float fnum = phoneNumber;// long to float

		long lnum = (long) 9.89f;// float to long

		char character = 'A';
		System.out.println("ASCII" + (int) character);
		int aAscii = 65;
		System.out.println((char) aAscii);
		String s = "Java";
		int num7 = 10;
		int num3 = 20;
		System.out.println(s + num7 + num3);
		System.out.println(num7 + num3 + s);

	}

}
