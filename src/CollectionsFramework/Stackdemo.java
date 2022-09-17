package CollectionsFramework;

import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		// adding elements
		stack.push("One");
		stack.push("Two");
		stack.push("Three");

		System.out.println(stack);
		stack.pop();// removes last element

		System.out.println(stack);

		System.out.println("Top of stack" + stack.peek());
	}
}
