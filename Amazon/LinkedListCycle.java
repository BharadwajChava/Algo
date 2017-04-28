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
    public boolean hasCycle(ListNode head) {
        ListNode h2 = head;
        while(head != null && h2 != null && h2.next != null){
            head = head.next;
            h2 = h2.next.next;
            if(head == h2)
                return true;
        }
        return false;
    }
}
