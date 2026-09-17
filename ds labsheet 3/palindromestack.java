import java.util.Stack;
 
public class palindromestack {
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false; 
            }
        }
        
        return true;
    }
 
    public static void main(String[] args) {
        String input1 = "racecar";
        String input2 = "hello";
        
        System.out.println("\"" + input1 + "\" is palindrome? " + isPalindrome(input1)); 
        System.out.println("\"" + input2 + "\" is palindrome? " + isPalindrome(input2)); 
    }
}