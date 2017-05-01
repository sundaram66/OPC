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
    public int sumOfLeftLeaves(TreeNode root) {
        
        if(root == null || root.left == null && root.right == null) return 0;
        
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum = 0;
        
        while(!q.isEmpty()) {
            
            int levelnum = q.size();
            
            for(int i=0;i<levelnum;i++) {
                TreeNode curr = q.poll();
                if(curr == null) continue;
                if(curr.left == null && curr.right == null && i%2==0) {
                    sum += curr.val;
                }
                q.add(curr.left);
                q.add(curr.right);
            }
            
        }
        
        return sum;
    }
}
