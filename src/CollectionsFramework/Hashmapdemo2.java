package CollectionsFramework;

import java.util.HashMap;

public class Hashmapdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Employees> hm = new HashMap();

		hm.put(1, new Employees(101, "Ajith", "Chennai", 80000));
		hm.put(2, new Employees(102, "Rajesh", "Hyderabe", 85000));
		hm.put(3, new Employees(103, "Puskin", "Chennai", 87000));
		hm.put(4, new Employees(104, "Jagan", "Chennai", 87000));

		System.out.println(hm.get(1));

		for (int a : hm.keySet()) {
			System.out.println(hm.get(a));
		}
	}

}
