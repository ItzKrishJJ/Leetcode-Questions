class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> mymap = new HashMap<>();
        for(String str: arr)
        {
            mymap.put(str,mymap.getOrDefault(str, 0)+1);
        }
        int cnt = 0;
        for(String str: arr)
        {
            if(mymap.get(str)==1)
            {
                cnt++;
            }
            if(cnt==k)
            {
                return str;
            }
        }
        return "";
    }
}