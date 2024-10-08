import java.util.Stack;

class Solution {
    public int minAddToMakeValid(String s) {
        if (s.length() == 0) {
            return 0;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();  
            } else {
                stack.push(')');  
            }
        }

        return stack.size();  
    }
}
