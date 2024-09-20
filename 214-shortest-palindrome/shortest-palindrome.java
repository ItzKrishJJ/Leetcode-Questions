class Solution {
    public String shortestPalindrome(String s) {
        // Edge case: if the string is empty, return an empty string
        if (s == null || s.length() == 0) {
            return s;
        }
        
        // Reverse the string
        String rev_s = new StringBuilder(s).reverse().toString();
        // Create a new string with a separator to avoid overlapping
        String s_new = s + "#" + rev_s;
        
        // Compute the KMP table
        int[] kmp = computeKMP(s_new);
        
        // Find the length of the longest palindromic prefix
        int longestPrefixLength = kmp[s_new.length() - 1];
        
        // Add the non-palindromic suffix of the reversed string in front of the original string
        return rev_s.substring(0, s.length() - longestPrefixLength) + s;
    }

    // Compute the KMP table
    private int[] computeKMP(String s) {
        int[] kmp = new int[s.length()];
        int j = 0; // length of the previous longest prefix suffix
        
        // Loop from the second character to the end of the string
        for (int i = 1; i < s.length(); i++) {
            // Adjust the length of the longest prefix suffix if characters do not match
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = kmp[j - 1];
            }
            
            // If the characters match, increment the length of the longest prefix suffix
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            
            // Update the KMP table with the length of the longest prefix suffix
            kmp[i] = j;
        }
        
        return kmp;
    }
}