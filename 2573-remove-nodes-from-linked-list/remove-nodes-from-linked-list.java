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
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode curr = head;
        ListNode prev = null;
        int max = curr.val;
        while(curr!=null){
            max = Math.max(max,curr.val);
            if(max > curr.val){
                prev.next = prev.next.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return reverse(head);
        
    }
    private ListNode reverse(ListNode head){
        if(head==null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode rLL = null;
        while(curr!=null){
            rLL = curr.next;
            curr.next = prev;
            prev = curr;
            curr = rLL;
        }
        return prev;
    }
}