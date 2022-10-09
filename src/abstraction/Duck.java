package abstraction;

public class Duck extends Bird {
	String duckName;

	public Duck(String duckName) {
//		duckName=raja
		this.duckName = duckName;

	}

	@Override
	boolean canFly() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getDuckname() {
		return duckName;
	}

}
