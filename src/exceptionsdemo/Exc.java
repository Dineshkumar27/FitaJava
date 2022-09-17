package exceptionsdemo;

public class Exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10;
		int num2=10;
		int arr[]= {11,22,33};
		try {
			System.out.println(num1/num2);
			arr[1]=90;//out of range
			System.out.println("End of try");
		}
		
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException aoe) {
			System.out.println(aoe.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This is finally");
		}

	}

}
