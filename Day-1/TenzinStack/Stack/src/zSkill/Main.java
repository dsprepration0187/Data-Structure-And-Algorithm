package zSkill;

//import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		int [] arr = {1,2,3,4};
		int [] ret = {};
		UserMainCode userCode = new UserMainCode();
		ret = userCode.MeanMedian(arr, arr.length);
		for(int a: ret) {
			System.out.print(a+" ");
		}
		
	}
	
}
