/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    
    static ListNode current;
    //Bottom Up
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        current = head;
        int len = getLen(head);
        
        return getBST(0,len-1);
        
    }
    
    public TreeNode getBST(int st, int end) {
        
        if(st > end) return null;
        int mid = (st+end)/2;
        
        TreeNode left = getBST(st,mid-1);
        TreeNode root = new TreeNode(current.val);
        current = current.next;
        TreeNode right = getBST(mid+1,end);        
        
        root.left = left;
        root.right = right;
        
        return root;            
    }
    
    
    public int getLen(ListNode head) {        
        int len = 0;
        while(head != null) {
            len++;
            head = head.next;
        }        
        return len;
    }
    
 
// Top Down : With Middle of Linked List.
    
public TreeNode sortedListToBST(ListNode head) {
    if(head==null) return null;
    return toBST(head,null);
}
public TreeNode toBST(ListNode head, ListNode tail){
    ListNode slow = head;
    ListNode fast = head;
    if(head==tail) return null;
    
    while(fast!=tail&&fast.next!=tail){
        fast = fast.next.next;
        slow = slow.next;
    }
    TreeNode thead = new TreeNode(slow.val);
    thead.left = toBST(head,slow);
    thead.right = toBST(slow.next,tail);
    return thead;
}
        
        
}
