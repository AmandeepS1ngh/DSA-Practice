class Solution {
  public:
    void print_divisors(int n) {
        // Code here.
                int i = 1;
        while(i<=n){
            if(n%i==0){
                cout<<i<<" ";
            }
            i++;
        }
    }
};
