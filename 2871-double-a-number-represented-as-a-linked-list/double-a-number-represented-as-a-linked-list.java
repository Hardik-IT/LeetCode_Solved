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
    private ListNode reverseLL(ListNode head){
        if(head == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode rLL = null;
        while(curr!=null){
            rLL = curr.next;
            curr.next = prev;
            prev = curr;
            curr = rLL;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        head = reverseLL(head);
        ListNode curr = head;
        ListNode prev = null;
        int carry = 0; 
        while(curr != null){
            int newVal = curr.val * 2 + carry;
            curr.val = newVal%10;
            if(newVal >= 10){
                carry=1;
            }else{
                carry=0;
            }
            prev = curr;
            curr = curr.next;
        }
        if(carry != 0){
            ListNode node = new ListNode(carry);
            prev.next = node;
        }
        return reverseLL(head);
    }
}