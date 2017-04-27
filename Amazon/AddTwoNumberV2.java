public class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lh = new ListNode(0);
        ListNode l = lh;
        int br = 0;
        while(l1 != null || l2 != null){
            int x = br + (l1!=null ? l1.val : 0) + (l2!=null ?l2.val : 0); 
            l.next = new ListNode(x%10);
            l = l.next;
            br = x/10;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(br != 0){
            l.next = new ListNode(br);
        }
        return lh.next;
    }
}
