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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int firstCriticalIndex = -1;
        int lastCriticalIndex = -1;
        int smallestDistance = Integer.MAX_VALUE;
        int prevValue = head.val;

        ListNode currentNode = head.next;
        int currentIndex = 1;

        while(currentNode != null && currentNode.next !=null){
            if ((prevValue < currentNode.val && currentNode.val > currentNode.next.val) || 
                (prevValue > currentNode.val && currentNode.val < currentNode.next.val)) {
                
                if (firstCriticalIndex == -1) {
                    firstCriticalIndex = currentIndex;
                } else {
                    smallestDistance = Math.min(smallestDistance, currentIndex - lastCriticalIndex);
                }    
                lastCriticalIndex = currentIndex;
            }
            prevValue = currentNode.val;
            currentNode = currentNode.next;
            currentIndex++;
        }
        if (firstCriticalIndex == -1 || lastCriticalIndex == firstCriticalIndex) {
            return new int[] {-1, -1};
        }
        return new int[] {smallestDistance, lastCriticalIndex - firstCriticalIndex};
    }
}