class Solution {
    static void printTillN(int N) {
        // code here
        if(N==0)return ;
        
        System.out.print(N+" ");
        printTillN(N-1);
        
    }
}
