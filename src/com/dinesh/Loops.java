package com.dinesh;

public class Loops {

	public static void main(String[] args) {

		int nums[] = { 11, 22, 33, 44, 55, 66 };
		System.out.println("Length of array" + nums.length);

//		for (int num : nums) {
//			System.out.println(num);
//		}
//		System.out.println();// create empty line
//		// it will create one gap in the line
//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}

//		i=0-->1 time
//		i<nums.length--> execute n+1 times
//		i++-> execute for n times
//		System.out.println();
//
//		for (int i = nums.length - 1; i >= 0; i--) {
//			System.out.println(nums[i]);
//		}
//	}

//
//		for (;;) {// infinte loop
//			System.out.println("fita");
//		}
//		System.out.println();

//		int i = 0;
//		for (System.out.println("Fita"); i < nums.length; i++) {
//			System.out.println(nums[i]);
//			System.out.println("Academy");
//
//		}
//		System.out.println(i);

//		int i = 8;
//		do {
//			System.out.println(i);
//		} while (i == 10);
////		
//		while (i < 15) {
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("End");

		// get input from user and give sum of the numbers entered

//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter your input number");
//		int number=scanner.nextInt();
//		System.out.println("you have entered "+number);
//		int total = 0;
//		Scanner scanner = new Scanner(System.in);
//		while (true) {
//			System.out.println("Enter your input number");
//			int number = scanner.nextInt();
//			total += number;
//			System.out.println("Do you want to enter a number again?(y/n)");
//			String choice = scanner.next();
//			if (choice.equals("n"))
//				break;// comeout of the loop
//
//		}
//		System.out.println("Addition of inputs are " + total);

//		while(true) {
//			break;
//		}
//		System.out.println();

//	do
//	{
//		System.out.println("Enter your input number");
//		int number = scanner.nextInt();
//		total += number;
//		System.out.println("Do you want to enter a number again?(y/n)");
//		String choice = scanner.next();
//		if (choice.equals("n"))
//			break;// comeout of the loop
//	}while(true);

//		for (int i = 0; i < 10; i++) {
//			System.out.println("i=" + i);
//			for (int j = 0; j < 7; j++) {// inner loop
//				if (j == 4)
//					break;// come out only from inner loop
//				System.out.print("j=" + j);
//			}
//			System.out.println();
//
//		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1)
				continue;// skip the current iteration
			System.out.println(i);
		}

	}
}
