class Solution {
    // Function to calculate Sum of a numbers.
    int Sum(int n) {
        // code here
        if(n == 1)return 1;
        
        return n + Sum(n-1);
    }
}
