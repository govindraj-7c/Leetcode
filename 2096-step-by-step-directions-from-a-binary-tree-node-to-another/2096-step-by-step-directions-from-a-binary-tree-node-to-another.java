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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder rootToSrc = new StringBuilder();
        StringBuilder rootToDest = new StringBuilder();

        findPath(root, startValue, rootToSrc);
        findPath(root, destValue, rootToDest);

        String result = "";

        int l = 0;

        while(l < rootToSrc.length() && l < rootToDest.length() && rootToSrc.charAt(l) == rootToDest.charAt(l)){
            l++;
        }

        for(int i=0; i<rootToSrc.length() - l; i++){
            result += 'U';
        }

        for(int i=l; i<rootToDest.length(); i++){
            result += rootToDest.charAt(i);
        }

        return result;
    }

    private boolean findPath(TreeNode root, int target, StringBuilder path){
        if(root == null){
            return false;
        }

        if(root.val == target){
            return true;
        }

        path.append('L');
        if(findPath(root.left, target, path)){
            return true;
        }
        path.deleteCharAt(path.length() - 1);

        path.append('R');
        if(findPath(root.right, target, path)){
            return true;
        }
        path.deleteCharAt(path.length() - 1);

        return false;
    }
}