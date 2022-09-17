package multilevelinheritance;

public class JavaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Customer customer1=new Customer(101, "King");//constructor will be called
//		Customer customer2=new Customer(102, "Neena");
//		System.out.println("Customer 1");
//		System.out.println("Id "+customer1.getId());
//		System.out.println("Name "+customer1.getName());
//		
//		System.out.println();
//		System.out.println("Customer 2");
//		System.out.println("Id "+customer2.getId());
//		System.out.println("Name "+customer2.getName());

//		
		/*
		 * Lion lion=new Lion(); System.out.println("No. of legs"+lion.legs);
		 * System.out.println("Name of the lion is "+lion.name); lion.eat();//calls the
		 * eat in lion class not in Animal class lion.sleeping();
		 */

		Goat goat = new Goat();
		goat.eat();// from animal class
		goat.eatingVeggies();// from herbivorus class
		goat.eating();// from its own class
		System.out.println("no of goat legs " + goat.legs);
	}

}
