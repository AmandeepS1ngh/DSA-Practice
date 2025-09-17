class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        helper(candidates,0,target,new ArrayList<>(),res);
        return res;
    }
    private static void helper(int[] arr,int ind,int target,List<Integer> ans,List<List<Integer>> res){

        if(ind == arr.length){
            // System.out.print(ans);
            if(target == 0){
            System.out.print(ans);
                res.add(new ArrayList<>(ans));
            }
            return;
        }
        if(arr[ind] <= target){
            
        ans.add(arr[ind]);
        helper(arr,ind,target-arr[ind],ans,res);
        ans.remove(ans.size()-1);
        }
        helper(arr,ind+1,target,ans,res);
    }
}
