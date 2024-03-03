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
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> temp = inorder(root);
        int[] arr = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            arr[i] = temp.get(i);
        }
        int left = 0, right = arr.length-1;
        while(left<right){
            if(arr[left] + arr[right] == k){
                return true;
            }
            else if(arr[left] + arr[right] > k){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
    public List<Integer> inorder(TreeNode root){
        if(root == null){
            return list;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
        return list;
    }
}