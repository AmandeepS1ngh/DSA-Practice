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
    // *Iterative*
    // public List<Integer> rightSideView(TreeNode root) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     List<Integer> res = new ArrayList<>();
    //     if(root==null)return res;
    //     helper(root,ans);
    //     for(int i=0;i<ans.size();i++){
    //         List<Integer> val = ans.get(i);
    //         res.add(val.get(0));
    //     }
    //     System.out.print(ans);
    //     return res;
    // }
    // private void helper(TreeNode root, List<List<Integer>> ans){
    //     Queue<TreeNode> q = new LinkedList<>();
    //     q.add(root);
    //     while(!q.isEmpty()){
    //         int size = q.size();

    //         List<Integer> sub = new ArrayList<>();
            
    //         for(int i=0;i<size;i++){
    //             TreeNode node = q.poll();
    //             sub.add(node.val);
    //             if(node.right != null ) q.add(node.right);
    //             if(node.left != null ) q.add(node.left);
    //         }
    //         ans.add(sub);
    //     }
    // 
    
    // *Recursive*
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> ans = new ArrayList<>();

        helper(root,ans,0);
        return ans;
    }
    private void helper(TreeNode root, List<Integer> ans,int level){
        if(root == null)return ;

        if(level == ans.size())ans.add(root.val);

        helper(root.right,ans,level+1);
        helper(root.left,ans,level+1);
    }
}
