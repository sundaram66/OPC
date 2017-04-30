package LC.Trees.Traversals;

import com.sun.javafx.scene.control.skin.LabeledImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by seetharams on 30/4/17.
 */
public class LevelOrder {

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

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);

        List<List<Integer>> list = getLevelOrder(root);
        System.out.println(list);

    }

    // Solved using delimiter null node for Tracking levels.
    // Can be solved by using two queues as well.

    public static List<List<Integer>> getLevelOrder(TreeNode node) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(node == null) return result;

        q.add(node);
        q.add(null);

        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()) {
            TreeNode current = q.poll();
            if(current == null) {
                result.add(list);
                if(q.peek() == null) return result;
                q.add(null);
                list = new ArrayList<>();
                continue;
            }
            else {
                list.add(current.val);
                if(current.left != null) q.add(current.left);
                if(current.right != null) q.add(current.right);
            }

        }


        return result;


    }
}
