package superkeyword;

public class Child extends Parent {

	String name;
	int age;
	String addr;

	public Child() {
		System.out.println("Child Constructor");
	}

	public Child(String name, int age, String addr) {
//		super(name,age);
		this.name = name;
		this.age = age;
		this.addr = addr;

	}

	void callShow() {
		super.show();// calling super class method
		System.out.println(super.val);// calling super class variable
	}

	public void printChildDetails() {
		System.out.println(name + " " + age + " " + addr);
	}

}
