class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        
        int n = val.length;
        int[][] T = new int[n+1][W+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                T[i][j] =-1;
            }
        }
        return helper(W,val,wt,n,T);
        
    }
    private static int helper(int W, int val[], int wt[], int n,int [][]T){
        if(n == 0 || W == 0 )return 0;
        
        if(T[n][W] != -1)
            return T[n][W];
        
        int pick =0;
        
        if(wt[n-1] <= W)
            pick = val[n-1] + helper(W-wt[n-1], val, wt, n-1,T);
            
            int notPick = helper(W,val,wt,n-1,T);
        
        return T[n][W] = Math.max(pick,notPick);
        
    }
}
