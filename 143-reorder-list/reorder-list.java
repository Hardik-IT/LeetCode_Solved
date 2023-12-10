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
    public void reorderList(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode headFirst = head;
        while(headFirst != null && headSecond !=null){
            ListNode temp;
            temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;
            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }
        if(headFirst != null){
            headFirst.next = null;
        }
        
    }
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
      public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
       ListNode prev = null;
       ListNode pres = head;
       ListNode next = pres.next;
       while(pres!=null){
           pres.next = prev;
           prev = pres;
           pres = next;
           if(next != null)
               next = next.next; 
       }
       return prev;
    }
}