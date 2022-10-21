//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//
// 
//
//Example 1:
//
//
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
//Example 2:
//
//Input: height = [4,2,0,3,2,5]
//Output: 9
// 
//
//Constraints:
//
//n == height.length
//1 <= n <= 2 * 104
//0 <= height[i] <= 105

package trappingWaterQuestion;
import java.lang.Math;

public class TrappingWaterSol {
    public static void main(String args[]) {
        int [] height = {4,2,0,3,2,5};
        int [] leftMaxArr = new int[height.length];
        int [] rightMaxArr = new int[height.length];
        int result = 0;
        
        leftMaxArr[0] = height[0];
        for(int i = 1;i<height.length;i++) {
            leftMaxArr[i] = Math.max(leftMaxArr[i-1], height[i]);
        }
        
        
        rightMaxArr[height.length-1] = height[height.length-1];
        for(int j = height.length-2;j>=0;j--) {
            rightMaxArr[j] = Math.max(rightMaxArr[j+1], height[j]);
        }
        
        
        for(int k =0;k< height.length;k++) {
            result += Math.min(rightMaxArr[k], leftMaxArr[k]) - height[k];
        }
        
        System.out.println("Unit of water stored is :"+result);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
