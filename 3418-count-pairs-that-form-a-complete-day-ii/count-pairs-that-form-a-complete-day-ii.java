import java.util.HashMap;

class Solution {
    public long countCompleteDayPairs(int[] hours) {
        HashMap<Integer, Integer> completeday = new HashMap<>();
        long count = 0;
        for (int num : hours) {
            int firstPair = num % 24;
            int secondPair = (24 - firstPair) % 24; 
            count +=completeday.getOrDefault(secondPair, 0);
            completeday.put(firstPair, completeday.getOrDefault(firstPair, 0) + 1);
        }
        return count;
    }
}
