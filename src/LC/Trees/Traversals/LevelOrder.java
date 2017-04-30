package LC.Trees.Traversals;
import java.util.*;

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

        List<List<Integer>> list1 = getLevelOrder_queue(root);
        System.out.println(list1);
        List<List<Integer>> list = getLevelOrder_bottomUp(root);
        System.out.println(list);


    }

    public static List<List<Integer>> getLevelOrder_queue(TreeNode node) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        if(node == null) return result;

        q.add(node);
        while(!q.isEmpty())  {
            int n = q.size();
            for(int i=0;i<n;i++) {
                TreeNode currNode = q.peek();
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
                list.add(q.poll().val);
            }
            result.add(list);
            list = new ArrayList<>();
        }
        return result;
    }

    public static List<List<Integer>> getLevelOrder_bottomUp(TreeNode node) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        if(node == null) return result;

        q.add(node);
        while(!q.isEmpty())  {
            int n = q.size();
            for(int i=0;i<n;i++) {
                TreeNode currNode = q.peek();
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
                list.add(q.poll().val);
            }
            result.add(0,list);
            list = new ArrayList<>();
        }
        return result;
    }


}
