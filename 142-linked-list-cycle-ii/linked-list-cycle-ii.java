/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int lengthCycle(ListNode head) {
        int length =0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp=slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return length;
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
               // if cycle found break and find cycle length 
               length = lengthCycle(slow);
               break;
            }
        }
        
        // if length is 0
        if(length == 0)
        {
            return null;
        }
        //find start node
        ListNode first = head;
        ListNode second = head;
        
        while(length > 0){
            second=second.next;
            length--;
        }

        //while first not meet second
        while(first != second){
            first = first.next;
            second = second.next;
        }
        return first;
    }
}