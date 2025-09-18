class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        
        int n = val.length;
        return helper(W,val,wt,n);
        
    }
    private static int helper(int W, int val[], int wt[], int n){
        if(n == 0 || W == 0 || )return 0;
        int pick =0;
        if(wt[n-1] <= W){
            pick = val[n-1] + helper(W-wt[n-1], val, wt, n-1);
        }
            int notPick = helper(W,val,wt,n-1);
        // else if(wt[n-1] > W){
        return Math.max(pick,notPick);
        // }
    }
}
