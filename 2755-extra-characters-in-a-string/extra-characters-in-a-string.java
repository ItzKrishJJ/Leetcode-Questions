import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> dictSet = new HashSet<>();
        for (String word : dictionary) {
            dictSet.add(word);
        }
        
        int n = s.length();
        int[] dp = new int[n + 1];
        
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[i + 1] + 1;
            
            for (int j = i; j < n; j++) {
                String substr = s.substring(i, j + 1);
                
                if (dictSet.contains(substr)) {
                    dp[i] = Math.min(dp[i], dp[j + 1]);
                }
            }
        }
        
        return dp[0];
    }
}
