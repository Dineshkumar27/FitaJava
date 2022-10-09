package CollectionsFramework;

import java.util.HashSet;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		HashSet<Integer> evennumbers = new HashSet<>();

		evennumbers.add(2);
		evennumbers.add(4);
		System.out.println(numbers);
		System.out.println(evennumbers);

		numbers.addAll(evennumbers);// union
		System.out.println(numbers);
//		numbers.retainAll(evennumbers);// intersection
//		System.out.println(numbers);
//		System.out.println(numbers);
//		System.out.println(evennumbers);
		numbers.removeAll(evennumbers);// Difference
		System.out.println(numbers);

	}

}
