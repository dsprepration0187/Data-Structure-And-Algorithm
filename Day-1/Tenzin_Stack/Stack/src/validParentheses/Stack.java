package validParentheses;

public class Stack {
	final int max = 100;
	int top;
	char[] stack = new char[max];

	Stack() {
		top = -1;
	}

	public boolean isEmpty() {
		if (top < 0) {
			return true;
		} else {
			return false;
		}
	}

	public char pop() {
		if (top < 0) {
			System.out.println("stack underflow!");
			return stack[top];
		} else {
//			System.out.println("top:"+top);
			return stack[top--];
		}
	}

	public boolean push(char C) {
		if (top >= max - 1) {
			System.out.println("Stack overflow!");
			return false;
		} else {
			stack[++top] = C;
//			System.out.println("top:"+top);
			return true;
		}
	}

	public void show() {
		for (int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

	public char getChar(int i) {
		return stack[i];
	}
}
