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
    
    List<Integer> list = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        if(root == null) return list;
        
       Stack<TreeNode> st = new Stack<>();
       TreeNode current = root;
       
       
       while(!st.isEmpty() || current != null) {
           if(current != null) {
               st.push(current);
               current = current.left;
           }
           else {
               TreeNode tNode = st.pop();
               list.add(tNode.val);
               current = tNode.right;
           }
       }
       
       return list;
        
    }
}
