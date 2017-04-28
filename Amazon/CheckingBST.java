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
    public boolean isValidBST(TreeNode root) {
        return isBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    public boolean isBST(TreeNode root, long maxValue, long minValue){
        if(root == null)
            return true;
            
        if(root.val >= maxValue || root.val <= minValue)
            return false;
        return ( isBST(root.right, maxValue, root.val) && isBST(root.left, root.val, minValue) );
    }
}
