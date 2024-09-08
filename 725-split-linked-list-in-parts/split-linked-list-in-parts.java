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
    public ListNode[] splitListToParts(ListNode head, int k) {
         ListNode[] list = new ListNode[k];
        ListNode temp =  head;
        int totallen = 0;
        while(temp!=null)
        {
            totallen++;
            temp = temp.next;
        }
        int rem = totallen % k;
        int len = totallen / k;
        ListNode node = head;
        ListNode rev = null;
        int i = 0;
        while(node!=null && i<k)
        {
            list[i] = node;
            for(int j=0;j<len+(rem>0?1:0);j++)
            {
                rev =  node;
                node  = node.next;
            }
           rev.next = null;
           i++;
           rem--;


        }
        return list;
    }
}