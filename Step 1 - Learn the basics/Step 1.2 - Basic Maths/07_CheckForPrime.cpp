class Solution {
  public:
    bool isPrime(int n) {
        int i = 2; 
        int count =0;
        while (i!=n){
            
            if(n%i==0) {
                count = count +1;
                
            }
            
            i++;
        }
        if(count !=0) return false;
        else return true;
        
    }
};
