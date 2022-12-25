package CollectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmapdemo {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		System.out.println(hm);

		HashMap<String, Integer> hm2 = new HashMap<>();
		hm2.put("Four", 4);
		hm2.put("Five", 5);
		hm2.put("Six", 6);
		hm.putAll(hm2);

		System.out.println(hm);
		LinkedHashMap lkined = new LinkedHashMap<>(hm);
		System.out.println(lkined);
//
//		System.out.println(hm.keySet());// display all keys
//		System.out.println(hm.values());
//
//		// accessing hash map values
//
//		System.out.println(hm.get("One"));// 1
//
//		// to print hashmap as set
//
//		System.out.println(hm.entrySet());
//		System.out.println(hm.getOrDefault("Seven", 77));
//
//		// iterating using keyset
//		for (String key : hm.keySet()) {
//			System.out.println(hm.get(key));
//		}
//
//		// itering using entry set
//
//		for (Entry<String, Integer> entry : hm.entrySet()) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//		}
//
//		// replacing a value
//
//		hm.replace("One", 11);
//		System.out.println("after replace " + hm);
//
//		// removing a element without condition
//
//		hm.remove("Two");
//		System.out.println("After removing Two " + hm);
//
//		// remove based on condition,remove key 3 only if the value is 7
//
//		hm.remove("Three", 7);
//
//		System.out.println("removing Three for the value 7 " + hm);
	}

}
