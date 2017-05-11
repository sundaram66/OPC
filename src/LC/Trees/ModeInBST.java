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
	
	int count = 1;
	int max = 0;
	TreeNode prev = null;

	public int[] findMode(TreeNode root) {
	    
	    if(root == null) return new int[0];
	    List<Integer> list = new ArrayList<>();
	
		inorder(root,list);

		int[] result = new int[list.size()];
		for(int i=0;i < list.size();i++) {
			result[i] = list.get(i);
		}
		return result;
	}	

	public void inorder(TreeNode node, List<Integer> list) {

			if(node == null)
				return;
			inorder(node.left,list);

			if(prev != null) {
				if(node.val == prev.val) count++;
				else count = 1;

			}

			if(count > max) {
				max = count;
				list.clear();
				list.add(node.val);
			}

			else if(count == max) { 
				list.add(node.val);
			}

			prev = node;
			inorder(node.right,list);
	}
}
