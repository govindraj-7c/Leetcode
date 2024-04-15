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
    public int sumNumbers(TreeNode root) {
        return solution(root, 0);
    }

    public int solution(TreeNode root, int digit){
        if(root == null) return 0;

        if(root.left == null && root.right == null){
            digit += root.val;
            return digit;
        }

        digit += root.val;
        return solution(root.left, digit*10) + solution(root.right, digit*10);
    }
}