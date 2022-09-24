package classobjectmethod;

public class Sample {

	private int id;
	private String addr;
	private String name;

	public Sample() {
		this.id = 101;
		this.addr = "Hyderabad";
		this.name = "John";
	}

	public Sample(int id, String addr, String name) {
		super();
		this.id = id;
		this.addr = addr;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getAddr() {
		return addr;
	}

	public String getName() {
		return name;
	}
}
