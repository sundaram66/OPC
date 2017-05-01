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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        getPaths(root,result,currentList,sum);
        return result;
    }
    
    public void getPaths(TreeNode root,List<List<Integer>> result,List<Integer> current, int sum) {
        
        if(root == null) return;
        
        current.add(root.val);
        if(root.left == null && root.right == null && sum == root.val) {
            result.add(new ArrayList<>(current));
        }
        
        else {
            getPaths(root.left,result,current,sum-root.val);
            getPaths(root.right,result,current,sum-root.val);
        }
        
        current.remove(current.size()-1);
        
        
        
    }
}
