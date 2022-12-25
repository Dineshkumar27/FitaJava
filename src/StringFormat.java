
public class StringFormat {
	public static String reverseString(String s) {

		char arr[] = s.toCharArray();
		String finalString = "";
		for (int i = arr.length - 1; i >= 0; i--) {

			finalString += arr[i];
		}
		return finalString;

	}
}
