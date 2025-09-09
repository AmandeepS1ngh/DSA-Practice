/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        // code here
        
        if (helper(root,Integer.MAX_VALUE,x) ==Integer.MAX_VALUE){
            return -1;
        }
        else return helper(root,Integer.MAX_VALUE,x);
        
        
    }
    private int helper(Node root,int mini,int val){
        if(root ==null)return mini;
        
        if(root.data >=val){
            mini = Math.min(mini,root.data);
            return helper(root.left,mini,val);
            
        }
        
        else{
            return helper(root.right,mini,val);
        }
        

    }
}
