package runtimepolymorphism;

import java.util.Scanner;

public class Decidedrink {

	public Drink decideDrink() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice 1. Coffee 2. Tea 3. HotChocolate");
		int choice = scanner.nextInt();
		if (choice == 1) {
			return new Coffee();
		} else if (choice == 2) {
			return new Tea();
		} else {
			return new HotChocolate();
		}

	}
}
