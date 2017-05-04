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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null) {
            return root;
        }
        
        while(root !=  null) {
            
          int diff = (root.val - p.val) * (root.val - q.val);
          //two cases here, both are negative, both are positive
          if(diff > 0) {
              if(root.val > p.val) root = root.left;
              else root = root.right;
          }
          else return root;
            
        }
        
        return root;
        
    }
}
