/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
//https://leetcode.com/problems/binary-tree-paths/#/description
 
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> result = new ArrayList<>();
        if(root == null) return result;
        
        getPaths(root,result,"");
        return result;
    }
    
    public void getPaths(TreeNode node, List<String> result,String current) {
        
        if(node == null) return;
        current += node.val + "->";
        
        if(node.left == null && node.right == null) {
            result.add(current.substring(0,current.length()-2));
        }
        
        else {
            getPaths(node.left,result,current);
            getPaths(node.right,result,current);
        }
        
        current = current.substring(0,current.length()-2);
        
        
        
    }
    
    
}
