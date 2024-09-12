class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>(); 
        for(char c:allowed.toCharArray())
        {
            set.add(c);
        }
        int count = 0;
        for(String s: words )
        {
            boolean consistent = true;
            for(int i=0;i<s.length();i++)
            {
                if(!set.contains(s.charAt(i)))
                {
                    consistent = false;
                    continue;
                }
                
            }
            if(consistent)
            {
                count++;
            }
        }
    return count;
    }
}