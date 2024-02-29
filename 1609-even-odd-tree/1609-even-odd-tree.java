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
    public boolean isEvenOddTree(TreeNode root) {
        if(root == null){
            return true;
        }
        Queue<TreeNode> que = new LinkedList<>();
        boolean flag = true;
        que.offer(root);
        while(!que.isEmpty()){
            int size = que.size();
            int prev = flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for(int i=0; i<size; i++){
                TreeNode curr = que.poll();
                if(flag){
                    if(curr.val%2 == 0 || curr.val <= prev){
                    return false;
                    }
                }
                else{
                    if(curr.val%2 != 0 || curr.val >= prev){
                        return false;
                    }
                }
                if(curr.left != null){
                    que.offer(curr.left);
                }
                if(curr.right != null){
                    que.offer(curr.right);
                }
                prev = curr.val;
            }
            flag = !flag;
        }
        return true;
    }
}