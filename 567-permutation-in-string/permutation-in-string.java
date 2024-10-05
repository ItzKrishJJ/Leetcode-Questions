import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> mymap = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            mymap.put(ch, mymap.getOrDefault(ch, 0) + 1);
        }

        int count = mymap.size();
        int len = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            char currentChar = s2.charAt(i);
            if (mymap.containsKey(currentChar)) {
                mymap.put(currentChar, mymap.get(currentChar) - 1);
                if (mymap.get(currentChar) == 0) {
                    count--;
                }
            }

            if (i >= len) {
                char leftChar = s2.charAt(i - len);
                if (mymap.containsKey(leftChar)) {
                    mymap.put(leftChar, mymap.get(leftChar) + 1);
                    if (mymap.get(leftChar) == 1) {
                        count++;
                    }
                }
            }

            if (count == 0) {
                return true;
            }
        }
        return false;
    }
}
