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
    private int helper(String str){
        int ans = 0;
        int pow = 1;
        for(int i=str.length()-1; i >= 0; i--){
            int val = str.charAt(i) - '0';
            ans += (pow * val);
            pow = pow * 2; 
        }
        return ans;
    }
    public int getDecimalValue(ListNode head) {
       StringBuilder str = new StringBuilder("");
        while(head != null){
            str.append(head.val);
            head = head.next;
        }
        int ans = helper(str.toString());
        return ans;
    }
}