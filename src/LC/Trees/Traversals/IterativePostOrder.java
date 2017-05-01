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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        Stack<TreeNode> st = new Stack<TreeNode>();
        
        st.push(root);
        while(!st.isEmpty()) {
            
            TreeNode temp = st.peek();
            if(temp.left == null && temp.right == null) {
                list.add(st.pop().val);
            }
            if(temp.right != null) {
                st.push(temp.right);
                temp.right = null;
            }
             if(temp.left != null) {
                st.push(temp.left);
                temp.left = null;
            }
            
        }
        
        return list;
        
    }
}
