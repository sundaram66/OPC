package LC.Trees.Traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by seetharams on 30/4/17.
 */
public class ZigZag {

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.right = new TreeNode(7);
//        root.right.left = new TreeNode(15);

        List<List<Integer>> list = zigzagLevelOrder(root);
        System.out.println(list);

    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        boolean lr = true;

        if(root == null) return result;
        q.add(root);
        while(!q.isEmpty()) {
            int n = q.size();
            for(int i=0;i<n;i++) {
                TreeNode curr = q.poll();

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);


                if(!lr) list.add(0,curr.val);
                else list.add(curr.val);
            }

            result.add(list);
            list = new ArrayList<>();
            lr = !lr;
        }
        return result;
    }
}
