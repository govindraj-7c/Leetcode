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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return helper(root,val,depth,1);
    }

    public TreeNode helper(TreeNode root, int val, int depth, int level){

        if(depth == 1){
            TreeNode a = new TreeNode(val);
            a.left = root;
            return a;
        }

        if(root == null) return root;

        if(level == depth-1){
            TreeNode leftman = root.left;
            TreeNode rightman = root.right;

            root.left = new TreeNode(val);
            root.right = new TreeNode(val);

            root.left.left = leftman;
            root.right.right = rightman;

            return root;
        }

        helper(root.left, val, depth, level+1);
        helper(root.right, val, depth, level+1);

        return root;
    }
}