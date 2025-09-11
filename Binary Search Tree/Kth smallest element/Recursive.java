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
        int count[] = new int[1];
        return helper(root,count,k);

    }
    private int helper(TreeNode root,int[] count,int k){
        if(root == null)return -1;
        
        int lh = helper(root.left,count,k);
        if(lh!=-1)return lh;
        count[0]++;
        if(count[0] ==k){
            return root.val;
        }
        return helper(root.right,count,k);

    }
}
