// Last updated: 11/08/2026, 16:11:32
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isValid("()"));       
        System.out.println(sol.isValid("()[]{}"));  
        System.out.println(sol.isValid("(]"));       
        System.out.println(sol.isValid("([])"));    
        System.out.println(sol.isValid("([)]"));     
    }
}
