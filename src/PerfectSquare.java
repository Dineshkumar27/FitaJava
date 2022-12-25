
public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 111;

		System.out.println(goodSquare(num));
	}

	static boolean goodSquare(int a) {
		return Math.sqrt(a) == Math.ceil(Math.sqrt(a));
	}

}
