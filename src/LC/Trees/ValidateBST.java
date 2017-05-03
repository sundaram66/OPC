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
    public boolean isValidBST(TreeNode root) {

       if(root == null) return true;
        
       Stack<TreeNode> st = new Stack<>();
       TreeNode current = root;
       Integer prevVal = null;
       
       
       while(!st.isEmpty() || current != null) {
           if(current != null) {
               st.push(current);
               current = current.left;
           }
           else {
               TreeNode tNode = st.pop();
               if(prevVal!=null && prevVal >= tNode.val){
                   return false;
               }
               prevVal = tNode.val;
               current = tNode.right;
           }
       }
       
       return true;
        
    }
}
