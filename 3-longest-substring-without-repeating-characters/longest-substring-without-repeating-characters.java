class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max_len = 0;
        List<Character> l1 = new ArrayList<Character>();
        while(end<s.length())
        {
            if(!l1.contains(s.charAt(end)))
            {
                l1.add(s.charAt(end));
                end++;
                max_len = Math.max(max_len,l1.size());
            }
            else{
                l1.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_len;
    }
}