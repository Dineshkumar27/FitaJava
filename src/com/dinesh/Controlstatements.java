package com.dinesh;

public class Controlstatements {

	public static void main(String[] args) {
		int age;
		// to get input from the user

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter age");
//		age = sc.nextInt();
//		System.out.println("Age you entered is " + age);

//		if (age > 18)
//			System.out.println("Eligible to Vote");

//		if (age >= 18) {// you can use relational operator and logical operator
//			System.out.println("above 18");
//			System.out.println("Eligible to Vote");
//		} else {
//			System.out.println("Below 18 is not eligible to vote");
//		}
//		System.out.println("hello");
//		int number = 40;
//
//		if (number > 0) {
//			System.out.println("+ve number");
//		} else if (number < 0) {
//			System.out.println("-ve number");
//		} else {
//			System.out.println("zero");
//		}

////		
//		System.out.print("End of the program");
//		System.out.print(age + "is the age of a person");
//		System.err.print("Hello");
//
////		
////		
//

		int num1 = 10, num2 = 25, num3 = 180;

//		if (num1 > num2) {
//			if (num1 > num3) {
//				System.out.println(num1 + "is greater");
//			} else {
//				System.out.println(num3 + "is greater");
//			}
//		} else if (num2 > num3) {
//			System.out.println(num2 + "is greater");
//		} else {
//			System.out.println(num3 + "is greater");
//		}
//
//		// // //avoid nested if conditions using logical operator // //
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + "is greater");
		}

		else if (num2 > num3) {
			System.out.println(num2 + "is greater");
		} else {
			System.out.println(num3 + "is greater");
		}
//
//		// and operator will check the right side condition only
//		// if the left side condition is true
//		if ((num1 < num2) && (++num3 > 1)) {
//			System.out.println("Inside if");
//		}
//
//		System.out.println(num3);

		// //how to check the letter is vowel or
//		  not 
//
//		char character = 'm';
//		switch (character) {
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			System.out.println("vowel");
//			break;
//		default:
//			System.out.println("Consonant");
//			break;
//		}
//		int i = 809898;
//		switch (i) {
//		case 897:
//		case 24:
//		case 128:
//		case 234:
//		default:
//		}
//		  90: // case 91: // System.out.println("vowel"); // break; // default: //
//		  System.out.println("Consonant"); // break; // } // // long l=890; // int
//		  i=(int)l;//converting from int to long // // // i=890; // l=i; // // }

	}
}
