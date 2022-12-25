package interfacedemo;

public class Myclass implements Inter1 {

	@Override
	public void showInter1() {
		System.out.println("val= " + val);
		System.out.println("show Inter1()");
	}

	@Override
	public void showInter2() {
		// TODO Auto-generated method stub
		System.out.println("val= " + val);
		System.out.println("show Inter2()");
	}

	@Override
	public void showGame() {
		// TODO Auto-generated method stub
		System.out.println("show Inter2()");
	}

}
