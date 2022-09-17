package multipleinheritance;

public class Child1 implements inter1,Inter3{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show()");
		System.out.println(num1);
		
	}
	
	@Override
	public void show3() {
		// TODO Auto-generated method stub
		System.out.println("Show3()");
	}
	
	@Override
	public void show2() {
		// TODO Auto-generated method stub
		System.out.println("Show2()");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print()");
	}

}
