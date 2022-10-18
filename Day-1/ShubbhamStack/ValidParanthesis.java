import java.util.*; 
class ValidParanthesis {
    public boolean isValid(String s) {
        String[] value = s.split("");
        Stack<String> stack = new Stack<String>();
        stack.push(value[0]);
        HashMap<String,String>  map = new HashMap<>();
        map.put("}","{");
        map.put(")","(");
        map.put("]","[");
        for(int i=1; i<value.length;i++){
            if(stack.empty()){
                stack.push(value[i]);
            }
            else if(stack.peek().equals(map.get(value[i]))){
                stack.pop();
            }
            else{
                stack.push(value[i]);
            }     
        }
        return stack.empty();   
    }
}