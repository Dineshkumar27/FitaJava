package hasarelationship;

public class Person {

	String name;
	int age;
	Address address;// has a relationship

	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
