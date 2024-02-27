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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int dia1 = height(root.left) + height(root.right);
        int dia2 = diameterOfBinaryTree(root.left);
        int dia3 = diameterOfBinaryTree(root.right);
        return Math.max(Math.max(dia2,dia3), dia1);
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int h1 = height(root.left);
        int h2 = height(root.right);
        return Math.max(h1,h2) + 1;
    }
}