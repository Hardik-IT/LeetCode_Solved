/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nextNode = null;
        if(node.next != null){
            nextNode = node.next;
        }
        int temp = nextNode.val;
        nextNode.val = node.val;
        node.val = temp;

        node.next = nextNode.next;
    }
}