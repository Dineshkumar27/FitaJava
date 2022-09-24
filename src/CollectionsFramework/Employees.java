package CollectionsFramework;

import java.util.Comparator;

class SalaryComparator implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		if (o1.sal == o2.sal) {
			return 0;
		} else if (o1.sal > o2.sal) {
			return 1;
		} else {
			return -1;
		}

	}

}

public class Employees implements Comparable<Employees> {

	int empId;
	String empName;
	String addr;
	int sal;

	public Employees(int empId, String empName, String addr, int sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.addr = addr;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + ", addr=" + addr + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employees o) {
		// TODO Auto-generated method stub
//		if (sal == o.sal) {
//			return 0;
//		} else if (sal > o.sal) {
//			return -1;
//		} else {
//			return 1;
//		}
		// sort by name
		return empName.compareTo(o.empName);
	}

}
