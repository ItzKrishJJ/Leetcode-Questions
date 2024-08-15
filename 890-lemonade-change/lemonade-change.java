class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int dlr : bills)
        {
            if(dlr==5)
            {
                five++;
            }
            else if(dlr==10)
            {
                if(five>0)
                {
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else {
                if(five>0 && ten>0)
                {
                    five--;
                    ten--;
                }
                else if(five>2)
                {
                    five -=3;
                }
                else{
                    return false;
                }
            }
            
        }
        return true;
    }
}