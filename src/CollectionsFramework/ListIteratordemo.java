package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratordemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);

//		System.out.println(al);

//		for (int i : al) {
//			System.out.println(i);
//		}

		ListIterator liter = al.listIterator();

		while (liter.hasNext()) {
			System.out.println(liter.next());
		}
		System.out.println();
		while (liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
	}
}
