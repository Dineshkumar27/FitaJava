package superkeyword;

public class Parent {
	int val = 10;
	String name;
	int age;

	public Parent(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public void show() {
		System.out.println("Val= " + val);
	}

	public void printParentDetails() {
		System.out.println("From Parent class");
		System.out.println("name " + name + " age " + age);
	}
}
