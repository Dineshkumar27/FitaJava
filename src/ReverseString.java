
public class ReverseString {

	public static void main(String[] args) {
		String inputString = "Hello How are you";
		System.out.println(StringFormat.reverseString(inputString));
		String words[] = inputString.split(" ");
		String myword = "";
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i]);
			myword += StringFormat.reverseString(words[i]) + " ";
		}
		System.out.println("\n" + myword);

	}

}
