package validParentheses2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String str;
		Stack stack = new Stack();
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		map.put(")", "(");
		map.put("}", "{");
		map.put("]", "[");

		System.out.print("Input:");
		str = sc.next();
		String[] strArray = str.split("");

		for (int i = 0; i < strArray.length; i++) {
			if (stack.isEmpty()) {
				stack.push(strArray[i]);
			} else if (map.get(strArray[i]) != null && map.get(strArray[i]).equals(stack.top())) {
				stack.pop();
			} else {
				stack.push(strArray[i]);
			}
		}


		if (stack.isEmpty()) {
			System.out.println("Valid!");
		} else {
			System.out.println("Not valid!");
		}
		sc.close();
	}
}

class Stack {
	final int size = 100;
	int top;
	String stack[] = new String[size];

	Stack() {
		top = -1;
	}

	public boolean push(String ele) {
		if (top >= size) {
			System.out.println("Overflow!");
			return false;
		} else {
			stack[++top] = ele;
			return true;
		}
	}

	public String pop() {
		if (isEmpty())
			return null;
		else {
			return stack[top--];
		}

	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	public String top() {
		return stack[top];
	}
}
