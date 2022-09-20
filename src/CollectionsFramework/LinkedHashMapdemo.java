package CollectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put(null, 9);
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);

		// maintains order
		LinkedHashMap<String, Integer> evenumbers = new LinkedHashMap<>(hm);

		evenumbers.put("Two", 22);
		evenumbers.put("Four", 4);
		evenumbers.put("Six", 6);

		System.out.println(evenumbers);

	}

}
