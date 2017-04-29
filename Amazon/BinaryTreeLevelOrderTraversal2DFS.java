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
    private int maxHeight(TreeNode root){
        if(root == null)
            return 0;
        int r = 1+maxHeight(root.right);
        int l = 1+maxHeight(root.left);
        return Math.max(r, l);
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int height = maxHeight(root);
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        if(root == null)
            return l;
        for(int i = 0; i < height; i++)
            l.add(new ArrayList<Integer>());
            
        getList(l, root, height, 0);
        return l;
    }
    private void getList(List<List<Integer>> l, TreeNode root, int height, int refHeight){
        if(root == null)
            return;
        
        l.get(height-refHeight-1).add(root.val);
        getList(l, root.left, height, refHeight+1);
        getList(l, root.right, height, refHeight+1);
    }
}
