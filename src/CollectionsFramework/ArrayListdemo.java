package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(2, 56);
		System.out.println(al);
		al.remove(1);
		System.out.println("After removing" + al);

		// updating the list
		al.set(0, 100);// [100,20]

		System.out.println("1st element" + al.get(0));
		System.out.println("Index of 10 " + al.indexOf(10));

		List<Employees> empList = new ArrayList<Employees>();

		empList.add(new Employees(101, "Jagan", "Chennai", 80000));
		empList.add(new Employees(102, "Manish", "HYD", 85000));
		empList.add(new Employees(103, "Disha", "Delhi", 70000));

		System.out.println(empList.get(0).sal);

		for (Employees e : empList) {
			System.out.println(e.empName);

		}
		System.out.println(weekdays.monday);
	}

}
