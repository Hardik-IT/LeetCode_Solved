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
        if(head==null){
            return null;
        }

        ListNode node=head;  
        int count = 0;     
        while(node!=null){
            count++;
            node = node.next;
        }
        if(count == n){
            ListNode newHead = head.next;
            head = null;
            return newHead;
        }


        int del = count - n;
        node=head; 
        while(node != null){
            del--;
            if(del == 0){  
                break;
            }
            node = node.next;
        }

        ListNode delNode = node.next;
        node.next = node.next.next;
        delNode = null;
        return head;
    }
}