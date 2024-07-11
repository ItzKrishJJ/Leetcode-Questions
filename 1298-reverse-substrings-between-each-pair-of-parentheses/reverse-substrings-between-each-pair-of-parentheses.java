import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public String reverseParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Deque<Integer> stack = new LinkedList<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                stack.push(res.length());
            } else if(ch == ')') {
                int startInd = stack.pop();
                String reversed = new StringBuilder(res.substring(startInd)).reverse().toString();
                res.replace(startInd, res.length(), reversed);
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}
