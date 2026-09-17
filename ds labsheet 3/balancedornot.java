import java.util.Stack;

public class balancedornot { 
    public static boolean isBalanced(String str) { 
        if (str == null) return false;
        
        Stack<Character> stack = new Stack<>();        
        for (int i = 0; i < str.length(); i++) {        
            char ch = str.charAt(i);                        
            if (ch == '(' || ch == '{' || ch == '[') {            
                stack.push(ch);        
            } else if (ch == ')' || ch == '}' || ch == ']') {                        
                if (stack.isEmpty()) {                
                    return false;            
                }                        
                char top = stack.pop();                                    
                if ((ch == ')' && top != '(') ||                
                    (ch == '}' && top != '{') ||                
                    (ch == ']' && top != '[')) {                
                    return false;            
                }        
            }    
        }            
        return stack.isEmpty();
    }

    public static void main(String[] args) {    
        String input1 = "{[]()([])}";    
        String input2 = "[ { ( } ) ]";        
        System.out.println("Input : " + input1);    
        System.out.println("Output: " + (isBalanced(input1) ? "Balanced String" : "Not Balanced"));        
        System.out.println("\nInput : " + input2);    
        System.out.println("Output: " + (isBalanced(input2) ? "Balanced String" : "Not Balanced"));
    } 
}