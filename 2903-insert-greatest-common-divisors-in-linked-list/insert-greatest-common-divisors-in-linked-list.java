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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null) return null;
        if(head.next == null) return head;
        ListNode current = head.next;
        ListNode prev = head;
        while(current!=null)
        {
            int no1 = prev.val;
            int no2 = current.val;
            while(no2 != 0)
            {
                int temp  =no2;
                no2 = no1% no2;
                no1 = temp;
            }
            ListNode node = new ListNode(no1);
            prev.next = node;
            node.next = current;

            prev = current;
            current = current.next;
        }
        return head;
    }
}