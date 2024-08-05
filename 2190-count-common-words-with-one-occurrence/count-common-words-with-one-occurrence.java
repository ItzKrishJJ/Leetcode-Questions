class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String , Integer> arr1 = new HashMap<>();
        Map<String , Integer> arr2 = new HashMap<>();
        for(String str : words1)
        {
            arr1.put(str,arr1.getOrDefault(str,0)+1);
        }
        for(String str : words2)
        {
            arr2.put(str,arr2.getOrDefault(str,0)+1);
        }

        int cnt = 0;
        for(String str: words1)
        {
            if(arr1.get(str)== 1 && arr2.getOrDefault(str,0)==1)
            {
                cnt++;
            }
        }
        return cnt;
    }
}