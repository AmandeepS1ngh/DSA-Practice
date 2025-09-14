// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> ans = new ArrayList<>();
        helper("",s,ans);
        Collections.sort(ans);
        return ans;
    }
    
    private static void helper(String op,String ip,List<String> ans){
        if(ip.length()==0){
            ans.add(op);
            return;
        }
        
        String op1 = op;
        String op2 = op + ip.charAt(0);
        ip = ip.substring(1);
        helper(op1,ip,ans);
        helper(op2,ip,ans);

    }
}
