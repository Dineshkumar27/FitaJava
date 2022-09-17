package multipleinheritance;

public interface inter1 {
	
	public void show();//public abstract void show();
	public void show2();
	
	default void method() {
		System.out.println("Default method");
	}
	int num1=19; //static final int num1=19

}
