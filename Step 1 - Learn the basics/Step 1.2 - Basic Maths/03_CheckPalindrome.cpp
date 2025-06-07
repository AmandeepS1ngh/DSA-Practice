class Solution {
public:
    bool isPalindrome(int x) {
        int rev_num = 0;
        int ans = x;
        while(x!=0){
            int last_num = x%10; // 3 2 1
            x = x/10;
            if (rev_num > INT_MAX / 10 || (rev_num == INT_MAX / 10 && last_num > 7)) {
                return 0;
            }
            if (rev_num < INT_MIN / 10 || (rev_num == INT_MIN / 10 && last_num < -8)) {
                return 0;
            }
            rev_num = (rev_num * 10) + last_num; // 3 32 321 
        }
        if (ans<0) return false;
        if(ans == rev_num) return true;
        else return false;
    }

};
