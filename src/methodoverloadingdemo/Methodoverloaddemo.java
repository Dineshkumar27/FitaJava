package methodoverloadingdemo;

public class Methodoverloaddemo {

	public static void main(String[] args) {
		Methodsexample obj = new Methodsexample();
		obj.add();
		obj.add(10, 20);
		obj.add(20.7f, 10.2f);
		System.out.println("add(double,double)" + obj.add(8.9, 8.1));

	}

}
