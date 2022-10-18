package validParentheses;

public class Split {

	public static void main(String args []) {
		String s = "()[]{}";
		String [] Ss = s.split("");
		for(String Str : Ss) {
			System.out.println(Str);
		}
		
	}
}
