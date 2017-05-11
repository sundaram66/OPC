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
    int tilt = 0;

    public int findTilt(TreeNode node) {
        tiltHelper(node);
        return tilt;
    }
    
    public int tiltHelper(TreeNode node) {
	
	    if(node == null) {
	    	return 0;
	    }

	    int leftVal = tiltHelper(node.left);
	    int rightVal = tiltHelper(node.right);

	    tilt += Math.abs(leftVal - rightVal);

	    return leftVal + rightVal + node.val;

    }
}
