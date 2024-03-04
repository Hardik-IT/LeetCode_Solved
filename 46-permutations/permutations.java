class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums,new ArrayList<>(),res);
        return res;
    }
    public void helper(int[] nums,List<Integer> used,List<List<Integer>> res){
        if(nums.length == used.size()){
            res.add(new ArrayList<>(used));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!used.contains(nums[i])){
                used.add(nums[i]);
                helper(nums,used,res);
                used.removeLast();
            }
        }
    }
}