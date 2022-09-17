package hasarelationship;

public class Hasademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Address address=new Address(4,"1st cross st");
           Person person=new Person("ABC",20,address);
           System.out.println(person);
	}

}
