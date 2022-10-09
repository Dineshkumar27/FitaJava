package multilevelinheritance;

public class Duck extends Bird {

	void showDuck() {
		canFly();
		super.canFly();
		printing();
	}

	void printing() {
		System.out.println("hello");
	}

	public Boolean canFly() {
		return false;
	}

}
