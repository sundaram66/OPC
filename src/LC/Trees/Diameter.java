
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
// https://leetcode.com/problems/diameter-of-binary-tree/#/description
public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        
        int[] diameter = {0};
        getDiameter(root, diameter);
        return diameter[0];
    }
    
    public int getDiameter(TreeNode node, int[] diameter) {
        
        if(node == null) return 0;
        
        int lh = getDiameter(node.left,diameter);
        int rh = getDiameter(node.right,diameter);
        
        diameter[0] = Math.max(diameter[0],lh+rh);
        return Math.max(lh,rh) + 1;
    }
}
