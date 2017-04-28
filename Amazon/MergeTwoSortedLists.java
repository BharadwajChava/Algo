/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode n1, ListNode n2) {
        ListNode n = new ListNode(0);
        ListNode nH = n;
        while(n1 != null && n2 != null){
            if(n1.val > n2.val){
                n.next = new ListNode(n2.val);
                n2 = n2.next;
            }else{
                n.next = new ListNode(n1.val);
                n1 = n1.next;
            }
            n = n.next;
        }
        if(n2 == null)
            n.next = n1;
        else if(n1 == null)
            n.next = n2;
        return nH.next;
    }
}
