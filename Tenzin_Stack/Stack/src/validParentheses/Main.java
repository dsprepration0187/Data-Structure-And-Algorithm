package validParentheses;

import java.util.Scanner;

public class Main {
	static Stack stack = new Stack();

	public static void main(String args[]) {
		String S;
		Scanner sc = new Scanner(System.in);
		StringSplit split = new StringSplit();

		System.out.println("Enter a string:");
		S = sc.next();

		char[] splittedString = split.splitString(S);

		for (char C : splittedString) {
			stack.push(C);
		}
		stackOp();
		if (stack.isEmpty()) {
			System.out.println("It is a valid parentheses!");
		}

		else {
			System.out.println("It is not a valid parentheses!");
		}

//		stack.show();

		sc.close();
	}

	public static void stackOp() {
		char temp = '\0';
		while (stack.top >= 0) {

			if (temp == '\0') {
				temp = stack.pop();
			} else {
				boolean checkReturned = check(temp, stack.getChar(stack.top));
				if (checkReturned) {
					stack.pop();
					temp = '\0';
				} else
					break;
			}
		}
	}

	public static boolean check(char firstChar, char secondChar) {
		boolean checkStatus = true;
		switch (firstChar) {
		case ')':
			if (secondChar != '(')
				checkStatus = false;
			break;

		case '}':
			if (secondChar != '{')
				checkStatus = false;
			break;

		case ']':
			if (secondChar != '[')
				checkStatus = false;
			break;
		default:
			checkStatus = false;
		}

		return checkStatus;
	}

}
