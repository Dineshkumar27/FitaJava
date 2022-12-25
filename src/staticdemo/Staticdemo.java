package staticdemo;

public class Staticdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Sample.val);
		Sample.show();

		Sample2 obj1 = new Sample2();
		System.out.println(obj1.studentId);// 11

		Sample2 obj2 = new Sample2();
		System.out.println(obj2.studentId);// 12

		Sample2 obj3 = new Sample2();// 13
		System.out.println(obj3.studentId);

		System.out.println(obj1.studentId);// 13
	}

}
