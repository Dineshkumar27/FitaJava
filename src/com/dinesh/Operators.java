package com.dinesh;

public class Operators {

	public static void main(String[] args) {
//		Arithmetic Operator(+,-,*,/,%)
		int num1 = 10;
		int num2 = 13;
//
//		System.out.println("num1+num2=" + (num1 + num2));// num1+num2=13
//		System.out.println(num1 + "+" + num2 + "= " + (num1 + num2));// 10+13=23
//		System.out.println(num1 + "-" + num2 + "= " + (num1 - num2));// 10-13=-3
//		System.out.println(num1 + "*" + num2 + "= " + (num1 * num2));
//		System.out.println(num1 + "/" + num2 + "= " + (num1 / num2));// quotient
//		System.out.println(num1 + "%" + num2 + "= " + (num1 % num2));// reminder
//		int result = 10 * 7 + 3 - (2 + 1) / 4;// pemdas
//		System.out.println("Result " + result);

		// relational operator(>,<,==,!=,<=,>=)

//		System.out.println(num1 + ">" + num2 + "= " + (num1 > num2));
//		System.out.println(num1 + "<" + num2 + "= " + (num1 < num2));
//		System.out.println(num1 + "==" + num2 + "= " + (num1 == num2));
//		System.out.println(num1 + "!=" + num2 + "= " + (num1 != num2));
//		System.out.println(num1 + ">=" + num2 + "= " + (num1 >= num2));
//		System.out.println(num1 + "<=" + num2 + "= " + (num1 <= num2));

		// logical operator(&&,||,!)

//		int num3 = 5;
//		System.out.println(
//				"(" + num1 + ">" + num2 + ")&&(" + num1 + ">" + num3 + ")= " + ((num1 > num2) && (num1 > num3)));
//
//		System.out.println(
//				"(" + num1 + ">" + num2 + ")||(" + num1 + ">" + num3 + ")= " + ((num1 > num2) || (num1 > num3)));
//
//		System.out.println(
//				"!(" + num1 + ">" + num2 + ")||(" + num1 + ">" + num3 + ")= " + !((num1 > num2) || (num1 > num3)));

		// Assignment Operator

//		num1 = num1 + 20;
//		num1 += 20;
//		num1 -= 20;
//		num1 *= 1;

		// bitwise operator

//		System.out.println(~num1);// negative of the next number
//		System.out.println(4 | 5);
//		System.out.println(4 & 5);
//		System.out.println(4 >> 1);

//		conditional operator ?: or ternary operator

//		syntax:  (condition)?value for true condition:value for false condition

//		int result = (num1 > num2) ? num1 : num2;
//		System.out.println(result);

//		System.out.println("Num1=" + num1);
//		System.out.println("Num2=" + num2);

		// postincrement-> first value will be assigned/print then incremented or
		// decremented
//
//		System.out.println("Num1++" + num1++);// 10
//		System.out.println("Num1 " + num1);// 11
//		System.out.println("Num2++" + num2++);// 13
//		System.out.println("Num2 " + num2);// 14

		// preincrement-> first value will be incremented or decremented then
		// printed/assigned

//		
//		System.out.println("++Num1 " + (++num1));// 11
//		System.out.println("Num1- " + num1);// 11
//		System.out.println("++Num2 " + (++num2));// 14
//		System.out.println("Num2- " + num2);// 14

		// same for decrement

//		System.out.println(++num1 - ++num1);// 11-12=-1
//
		int a = 6, b = 5;
//		System.out.println(b-- * b++);

		int result = a++ - b-- * b++ + ++a;

//
		System.out.println(result);
	}

}
