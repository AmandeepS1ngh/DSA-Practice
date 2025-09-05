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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
        Boolean leftToRight = true;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> sub = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                sub.add(node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right !=null)q.add(node.right);
            }
            if(!leftToRight){
                Collections.reverse(sub);
            }
            ans.add(sub);
            leftToRight = !leftToRight;
        }
        return ans;
    }
}
