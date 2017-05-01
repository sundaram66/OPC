public class Solution {
    
    
    public int pathSum(TreeNode root, int sum) {
        if(root == null) 
            return 0;
        return getPaths(root,sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
        
    public int getPaths(TreeNode root, int sum) {
        int no = 0;
        if(root == null) 
            return no;
        if(sum == root.val) 
            no++;        
        no += getPaths(root.left, sum-root.val);
        no += getPaths(root.right, sum-root.val);        
        return no;
        
    }
}
