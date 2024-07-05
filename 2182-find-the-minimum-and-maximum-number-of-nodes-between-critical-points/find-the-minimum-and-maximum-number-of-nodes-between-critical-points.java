/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // int criticalCount = 0;
        Integer prev_critical = null,first_critical = null;
        int res[] =new int[]{-1,-1};
        ListNode curr = head.next;
        ListNode prev = head;
        int curridx = 1;

        while(curr.next!=null)
        {
            if((curr.val>prev.val && curr.val>curr.next.val) || (curr.val<prev.val && curr.val<curr.next.val) )
            {
                if(prev_critical!=null)
                {
                    res[0] = (res[0]==-1) ? curridx - prev_critical : Math.min(res[0], curridx - prev_critical);
                }
                else{
                    first_critical = curridx;
                }
                prev_critical = curridx;
            }
            prev = curr;
            curr = curr.next;
            curridx++;
        }

        if(prev_critical !=null && !prev_critical.equals(first_critical))
        {
            res[1] = prev_critical - first_critical;
        }
        return res;
    }
}