/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        else if(p == null)
            return false;
        else if(q == null)
            return false;
        
        if(p.val != q.val)
            return false;
        
        return (true&&isSameTree(p.right, q.right)&&true&&isSameTree(p.left, q.left)); 
        
    }
}
