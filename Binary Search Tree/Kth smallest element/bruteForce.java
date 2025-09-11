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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> arr = new ArrayList<>();
        helper(root,arr);
        System.out.print(arr);
        return arr.get(k-1);

    }
    private void helper(TreeNode root, List<Integer> arr){
        if(root == null)return;

        helper(root.left,arr);
        arr.add(root.val);
        helper(root.right,arr);
    }
}
