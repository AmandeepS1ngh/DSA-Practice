class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        
        int n = val.length;
        int[][] T = new int[n+1][W+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i == 0 || j == 0){
                    T[i][j] =0;
                }
            }
        }
        for(int i=1; i<n+1; i++){
            
            for(int j=1; j<W+1; j++){
                
                if(wt[i-1] <= j ){
                    
                    T[i][j] = Math.max( val[i-1] + T[i-1][j-wt[i-1]], 
                    
                    T[i-1][j]);
                
                    
                }
                
                else{
                
                 T[i][j] = T[i-1][j];
                
                    
                }
            }
        }
        
        return T[n][W];
        
    }
    
}
