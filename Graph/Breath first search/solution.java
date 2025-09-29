class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int v = adj.size();
        int s = 0;
        boolean vis[] = new boolean[v];
        
        vis[s] = true;
        q.add(s);
        
        
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            
            for(int x : adj.get(node)){
                if(vis[x] == false){
                    vis[x] = true;
                    q.add(x);
                }
            }
        }
        return ans;
    }
}
