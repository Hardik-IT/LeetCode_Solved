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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l1=head;
        ListNode l2=head;
        for(int i=0;i<n;i++){
            l2 = l2.next;
        }
        if(l2 == null){
            return head.next;
        }

        while(l2.next != null){
            l2 = l2.next;
            l1 = l1.next;
        }
        l1.next = l1.next.next;
        return head;
    }
}