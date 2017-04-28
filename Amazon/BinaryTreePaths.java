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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l = new LinkedList<String>();
        if(root == null)
            return l;
        if(root.right == null && root.left == null){
            l.add(root.val+"");
            return l;
        }
        
        for(String ll: binaryTreePaths(root.left))
            l.add( ll + "<-" + root.val );
        for(String ll: binaryTreePaths(root.right))
            l.add( ll + "<-" + root.val );
            
        return l;
    } 
}
