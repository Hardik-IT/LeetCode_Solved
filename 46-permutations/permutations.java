class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,new ArrayList<>(), ans);
        return ans;
    }
    public void helper(int[] nums,List<Integer> usedElement,List<List<Integer>> ans){
        if(nums.length==usedElement.size()){
            ans.add(new ArrayList<>(usedElement));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!usedElement.contains(nums[i])){
                usedElement.add(nums[i]);
                helper(nums,usedElement,ans);
                usedElement.removeLast();
            }
        }
    }
}