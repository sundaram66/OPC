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
    public int minDepth(TreeNode root) {
        
        if(root == null) return 0;
        
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        
        // IN Max Depth , we are checking Max of left and right so skewed trees cases are handled.
        // Here, we need to check that explicitly to check if is skewed.
        return (left == 0 || right == 0 ? left + right +1 : Math.min(left,right) + 1 );
    }
}
