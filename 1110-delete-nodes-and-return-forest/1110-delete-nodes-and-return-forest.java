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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        int n = to_delete.length;
        List<TreeNode> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(to_delete[i]);
        }

        delete(root, set, ans);

        if(!set.contains(root.val)){
            ans.add(root);
        }

        return ans;
    }
    private TreeNode delete(TreeNode root, HashSet<Integer> set, List<TreeNode> ans){
        if(root == null) return null;

        root.left = delete(root.left, set, ans);
        root.right = delete(root.right, set, ans);

        if(set.contains(root.val)){
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                ans.add(root.right);
                return null;
            }
            else if(root.right == null){
                ans.add(root.left);
                return null;
            }
            else{
                ans.add(root.left);
                ans.add(root.right);
                return null;
            }
        }

        return root;
    }
}