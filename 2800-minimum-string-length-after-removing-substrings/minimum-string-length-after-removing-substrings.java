class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            if (!stack.isEmpty() && ((current == 'B' && stack.peek() == 'A') || (current == 'D' && stack.peek() == 'C'))) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }
        return stack.size();
    }
}
