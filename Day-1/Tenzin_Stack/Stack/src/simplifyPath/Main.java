package simplifyPath;

import java.util.Scanner;

public class Main {

	public static void main(String args []) {
		String s;
		char [] splittedStr ;
		SplitString splitStr = new SplitString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		s = sc.next();
		
		splittedStr = splitStr.splitString(s);
		
		for(char Char : splittedStr) {
			System.out.println(Char);
		}
		
		sc.close();
		
	}
}
