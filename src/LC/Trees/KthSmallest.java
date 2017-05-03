/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 // Use Augmented tree to store no of left nodes in each node.
 // if lcount + 1 == k , return root node
 // else if k > lcount +1 , k = k - (lcount + 1) go ti right subtree
 // else go to left subtree
 
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        
       if(root == null) return 0;
        
       Stack<TreeNode> st = new Stack<>();
       TreeNode current = root;
     
       while(!st.isEmpty() || current != null) {
           if(current != null) {
               st.push(current);
               current = current.left;
           }
           else {
               k--;
               TreeNode tNode = st.pop();
               if(k==0) return tNode.val;
               current = tNode.right;
           }
       }
       
       return 0;
        
    }
}
