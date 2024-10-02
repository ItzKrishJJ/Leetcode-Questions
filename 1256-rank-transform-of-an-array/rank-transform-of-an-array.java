import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return new int[0];
        }

        int newarr[] = arr.clone();
        Arrays.sort(newarr);
        
        HashMap<Integer, Integer> mymap = new HashMap<>();
        int rank = 1;
        mymap.put(newarr[0], rank);
        
        for (int i = 1; i < newarr.length; i++) {
            if (newarr[i] != newarr[i - 1]) {
                rank++;
            }
            mymap.put(newarr[i], rank);
        }
        
      
        for (int i = 0; i < n; i++) {
            newarr[i] = mymap.get(arr[i]);
        }
        
        return newarr;
    }
}
