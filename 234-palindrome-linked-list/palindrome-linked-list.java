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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reReverseHead = headSecond;

        while(head!=null && headSecond!=null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(reReverseHead);
        return head == null || headSecond==null;
    }
    public ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode prev=null;
        ListNode pres=head;
        ListNode next = pres.next;
        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres=next;
            if(next != null)
                next=next.next;
        }
        return prev;
    }
}