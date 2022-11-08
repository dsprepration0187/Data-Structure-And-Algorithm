import java.util.*;
import java.lang.Math;
class Solution {
    public int trap(int[] height) {
     Stack<Integer> stack = new Stack<>();
     int ans = 0;
     int m1 = height[0];
        for(int i=1;i<height.length;i++){
            if(height[i] > m1){
                while(!stack.isEmpty()){
                    ans += m1 - stack.pop();
                }
                m1 = height[i];
            }
            else{
                stack.push(height[i]);
            }
        }
        if(!stack.isEmpty()){
             m1 = stack.pop();
        }
        while(!stack.isEmpty()){
           
            if(stack.peek() > m1){
                m1 = stack.peek();
            }
            ans += m1 - stack.pop();
        }
        return ans;
    }
        
}