/************************************************************

 Following is the Binary Tree node structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 ************************************************************/

import java.util.*;

public class Solution {
    private static boolean isLeaf(TreeNode root){
        if(root.left == null && root.right == null){
            return true;
        }
        return false;
    }
    private static void leftBoundary(TreeNode root,List<Integer> ans){
        TreeNode temp = root.left;
        while(temp != null){
            if(!isLeaf(temp)){
                ans.add(temp.data);
            }
            if(temp.left!=null){
                temp = temp.left;
            }
            else{
                temp = temp.right;
            }   
        }
    }
    private static void leafboundry(TreeNode root,List<Integer> ans){
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        if(root.left !=null){
            leafboundry(root.left,ans);
        }
        if(root.right !=null){
            leafboundry(root.right,ans);
        }

    }
    private static void rightBoundary(TreeNode root,List<Integer> ans){
        TreeNode curr = root.right;
        Stack <TreeNode> s = new Stack<>();
        while(curr!=null){
            if(!isLeaf(curr)){
                s.add(curr);
            }
            if(curr.right!=null)curr = curr.right;
            else curr = curr.left;
        }
        while(!s.isEmpty()){
            TreeNode node = s.pop();
            ans.add(node.data);
        }
    }
    public static List<Integer> traverseBoundary(TreeNode root){
        // Write your code here.
        List<Integer> ans = new ArrayList<>();
        ans.add(root.data);
        leftBoundary(root,ans);
        leafboundry(root,ans);
        rightBoundary(root,ans);
        return ans;
    }
}
