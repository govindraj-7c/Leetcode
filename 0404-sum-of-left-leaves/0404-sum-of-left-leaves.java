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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        return solution(root, false);  
    }

    public int solution(TreeNode root, boolean flag){
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            return flag ? root.val : 0;
        }

        int leftSum = solution(root.left, true);
        int rightSum = solution(root.right, false);

        return leftSum + rightSum;
    }
}