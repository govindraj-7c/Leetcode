/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        int size = 0;
        ListNode curr = head;

        while(curr != null){
            size++;
            curr = curr.next;
        }

        curr = head;
        int[] list = new int[size];
        for(int i=0; i<size; i++){
            list[i] = curr.val;
            curr = curr.next;
        }

        return buildTree(list, 0, size-1);
    }
    private TreeNode buildTree(int[] list, int start, int end){
        if(start > end) return null;
        int mid = start + (end - start)/2;
        TreeNode root = new TreeNode(list[mid]);
        root.left = buildTree(list, start, mid-1);
        root.right = buildTree(list, mid+1, end);
        return root;
    }
}