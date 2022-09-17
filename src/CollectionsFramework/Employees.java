package CollectionsFramework;

public class Employees {

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

}
