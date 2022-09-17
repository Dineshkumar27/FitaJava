package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itratordemo {

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

		Iterator iter = al.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
