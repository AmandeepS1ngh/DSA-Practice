/*********************************************

 Following is the TreeNode class structure

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

 *********************************************/

import java.util.*;

public class Solution {
    static class Pair{
        TreeNode Node;
        int data;
        Pair(TreeNode Node,int data){
            this.data = data;
            this.Node = Node;
        }
    }
    public static List<Integer> getTopView(TreeNode root) {
        // Write your code here.
        List<Integer> ans = new ArrayList<>();
        if(root == null)return ans;
        Queue<Pair> q = new LinkedList<>();

        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            TreeNode temp = curr.Node;
            int data = curr.data;

            if(map.get(data) == null)map.put(data,temp.data);
            if(temp.left!=null)q.add(new Pair(temp.left,data-1));
            if(temp.right!=null)q.add(new Pair(temp.right,data+1));   
        }
            // for (int value : map.values()) { ans.add(value); }
            ans.addAll(map.values());
            return ans;



    }
}
