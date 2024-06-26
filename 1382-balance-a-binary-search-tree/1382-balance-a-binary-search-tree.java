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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sorted = new ArrayList<>();
        inOrderTraversal(root, sorted);

        return buildBalancedBST(sorted, 0, sorted.size()-1);
    }

    private TreeNode buildBalancedBST(List<Integer> elements, int start, int end){
        if(start > end) return null;

        int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(elements.get(mid));
        node.left = buildBalancedBST(elements, start, mid-1);
        node.right = buildBalancedBST(elements, mid+1, end);

        return node;
    }

    private void inOrderTraversal(TreeNode root, List<Integer> sorted){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left, sorted);
        sorted.add(root.val);
        inOrderTraversal(root.right, sorted);
    }
}