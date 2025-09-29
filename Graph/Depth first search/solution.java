class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[adj.size()];
        helper(0,adj,vis,ans);
        return ans;
    }
    public static void helper(int s,ArrayList<ArrayList<Integer>> adj, boolean vis[],ArrayList<Integer> ans){
        vis[s] = true;
        ans.add(s);
        
        for(int i : adj.get(s)){
            if(vis[i] == false){
                helper(i,adj,vis,ans);
            }
        }
    }
}
