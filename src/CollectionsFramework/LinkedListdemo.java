package CollectionsFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListdemo {
	public static void main(String[] args) {

		List<Integer> ll = new LinkedList<>();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(1, 35);
		System.out.println(ll);
		ll.remove(2);
		System.out.println("After Removing " + ll);

		System.out.println(ll.indexOf(40));
		ll.set(3, 890);
		System.out.println(ll);
	}

}
