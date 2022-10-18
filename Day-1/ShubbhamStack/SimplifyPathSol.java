import java.util.*;
class SimplifyPathSol {
    public String simplifyPath(String path) {
    
        Stack<String> stack = new Stack<>();
        Stack<String> tempStack = new Stack<>();
        String[] value = path.split("/");
        for(String str:value){
            if(!stack.isEmpty() && "..".equals(str)){
                stack.pop();
            }
            else if(!"".equals(str) && ! ".".equals(str) && ! "..".equals(str)){
                stack.push(str);
            }
        }
        
        if(stack.isEmpty()){
            return "/";
        }
        String newPath = "/";
        
        while(!stack.isEmpty()){
            tempStack.push(stack.pop());
            
        }
        while(!tempStack.isEmpty()){
             newPath += tempStack.pop();
            if(!tempStack.isEmpty()){
                newPath += "/";
            
             }
        }
        
        return newPath;
            
        }
    
}
