package com.dinesh;

public class Typeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		char a='k';
//		byte b=a;//error
//		
//		boolean b1=true;
//		int i=(int)b1;
		
		//possible
		
//		int x=65;
////		char m=x;
//		System.out.println((char)x);
//		
//		char n='z';
//		System.out.println((int)n);
//		System.out.println();
//		
//		double d=90.89989;
//		int m=(int) (d);
//		System.out.println(m);
//		
////		int x=10;
////		boolean b=x;
//		
//		
//		long l=87987987;
//		float f=1;
//		
//		float myf=9879.8989f;
//		long l=myf;
//		int num1=10;
//		if((num1==1)||(++num1>1)) {
//			System.out.println(num1);
//			
//		}else {
//		System.out.println(num1);
//		}
//		
		
		//representing binary number
		int b=10;//integer
		int x=0b1010;//10 binary valid
//		int x1=0b1011; 11 binary valid
//		int x2=0b1012;//invalid as it should have only 0's and 1's but 2 is given
		
		//representing octal number 0-7
		
		int o1=012;
//		int o2=012345678;//invalid representation
		
		//representing hexa decimal 0-9 ABCDEF
		
		int h1=0x12a;//valid
		int h2=0x78d;//invalid 
		System.out.println(x+2);
		System.out.println(o1);
		System.out.println(h1);
		

	}

}
