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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return list;
        TreeNode current = root;
        st.push(root);
        
        while(!st.isEmpty()) {
            
            current = st.pop();
            list.add(current.val);
            
            if(current.right != null) st.push(current.right);
            if(current.left != null) st.push(current.left);
            
            
            
        }
        
        return list;
    }
}
