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
    public int countNodes(TreeNode root) {
        
        if(root == null) return 0;
        
        int left = getLeftHeight(root) + 1;
        int right = getRightHeight(root) + 1;
        
        if(left == right) {
            return (2 << (left-1)) - 1;
        }
        
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    
    public int getLeftHeight(TreeNode node) {
        if(node == null) return 0;
        int h = 0;
        while(node.left != null) {
            node = node.left;
            h++;
        }
        return h;
        
    }
    
    public int getRightHeight(TreeNode node) {
        if(node == null) return 0;
        int h = 0;
        while(node.right != null) {
            node = node.right;
            h++;
        }
        return h;
        
    }
    
    
    
}
