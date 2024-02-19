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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int leftSub = height(root.left);
        int rightSub = height(root.right);
        if(Math.abs(leftSub - rightSub) > 1){
            return false;
        }
        else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftCount = height(root.left);
        int rightCount = height(root.right);
        return Math.max(leftCount, rightCount) + 1;
    }
}