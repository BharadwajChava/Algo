/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode h1 = head;
        ListNode h2 = head;
        while(h1 != null && h2.next != null){
            h2 = h2.next;
            h1.val = h1.val+h2.val;
            h2.val = h1.val-h2.val;
            h1.val = h1.val-h2.val;
            h1 = h2.next;
            h2 = h1;
        }
        return head;
    }
}
