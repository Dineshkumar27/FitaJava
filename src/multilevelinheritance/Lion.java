package multilevelinheritance;

public class Lion extends Animal{
	
	String name="Simba";
	
	public void sleeping() {
		System.out.println(name+"is sleeping");
	}
	
	
	  @Override public void eat() {
	  System.out.println("Lion is not feeling hungry"); }
	 

}
