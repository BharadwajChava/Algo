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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        if(root == null)
            return l;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> li = new ArrayList<Integer>();
            for(int i = 0; i < len; i++){
                TreeNode n = q.poll();
                li.add(n.val);
                if(n.left != null)
                    q.offer(n.left);
                if(n.right != null)
                    q.offer(n.right);
            }
            l.add(0, li);
        }
        return l;
    }
}
