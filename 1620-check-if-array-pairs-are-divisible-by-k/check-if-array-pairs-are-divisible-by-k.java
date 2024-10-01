class Solution {
    public boolean canArrange(int[] arr, int k) {
        int remindercount[] = new int[k];
        for(int num: arr)
        {
            int reminder = ((num % k)+k)%k;
            remindercount[reminder]++;
        }
        if(remindercount[0]%2!=0)
        {
            return false;
        }
        for(int i=1; i<=k/2;i++)
        {
            if(remindercount[i]!=remindercount[k-i])
            {
                return false;
            }
        }
        return true;
    }
}