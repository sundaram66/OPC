https://leetcode.com/problems/sum-root-to-leaf-numbers/#/description

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
    
    
    public int sumNumbers(TreeNode root) {
        int result = 0;
        return getSum(root,result);
    }
    
    public int getSum(TreeNode root,int result) {
        
        if(root == null) return 0;
        
        result = result *10 + root.val;
        
        if(root.left == null && root.right == null) {
            return result;
        }
        
        int left = getSum(root.left,result);
        int right = getSum(root.right,result);
        result = left + right;
        
        return result;
        
    
        
        
    }
}
