package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employees> empList = new ArrayList<Employees>();

		empList.add(new Employees(101, "AAAA", "Chennai", 80000));
		empList.add(new Employees(102, "BBBB", "HYD", 85000));
		empList.add(new Employees(103, "CCCC", "Delhi", 70000));

		System.out.println(empList);
//		Collections.sort(empList);
//
//		System.out.println(empList);

		Collections.sort(empList, new SalaryComparator());

	}

}
