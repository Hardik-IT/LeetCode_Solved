class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        return findSubsets(nums,0);
    }
    public List<List<Integer>> findSubsets(int[] nums,int start){
        if(start == nums.length){
             List<List<Integer>> ans = new ArrayList<>();
             ans.add(new ArrayList<>());
            return ans;
        }
        List<List<Integer>> recResult = findSubsets(nums,start+1);
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(recResult);
        for(List<Integer> recSubset:recResult){
            ArrayList<Integer> cAns = new ArrayList<>();
            cAns.add(nums[start]);
            cAns.addAll(recSubset);
            ans.add(cAns);
        }
        return ans;
    }
}