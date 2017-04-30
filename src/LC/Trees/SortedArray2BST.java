//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/#/description

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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums == null || nums.length == 0) 
            return null;
        int n = nums.length;
        return getBST(nums,0,n-1);
        
    }
    
    
    public TreeNode getBST(int[] nums,int st,int end) {
        if(st  > end) return null;
        int mid = (st+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = getBST(nums,st,mid-1);
        root.right = getBST(nums,mid+1,end);
        return root;
    }
}
