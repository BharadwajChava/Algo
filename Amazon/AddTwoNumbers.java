/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public void addNodes(ListNode l1, int br, ListNode ll){
        if(l1 == null)
            return;
        while(l1 != null){
            int x = br + l1.val;
            ListNode l = new ListNode(x%10);
            br = x/10;
            ll.next = l;
            ll = l;
            l1 = l1.next;
        }
        if(br != 0){
            ListNode l = new ListNode(br);
            ll.next = l;
        }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lh = null;
        ListNode ll = null;
        boolean begin = true;
        int br = 0;
        while(l1 != null && l2 != null){
            int x = br + l1.val + l2.val; 
            ListNode l = new ListNode(x%10);
            br = x/10;
            if(begin){
                begin = false;
                lh = l;
                ll = l;
            }else{
                ll.next = l;
                ll = l;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if(br != 0 && l1 == null && l2 == null){
            ListNode l = new ListNode(br);
            ll.next = l;
        }
        addNodes(l1, br, ll);
        addNodes(l2, br, ll);
        return lh;
    }
}
