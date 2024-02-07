class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,new ArrayList<>(),new boolean[nums.length], ans);
        return ans;
    }
    public static void helper(int[] nums,List<Integer> usedElement,boolean[] used,List<List<Integer>> ans){
        if(nums.length==usedElement.size()){
            ans.add(new ArrayList<>(usedElement));
            return;
        }
        for(int i=0;i<nums.length;i++){
             if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue; // Skip duplicates and used elements
            }
                usedElement.add(nums[i]);
                used[i] = true;
                helper(nums,usedElement,used,ans);
                used[i] = false;
                int index=usedElement.size()-1;
                usedElement.remove(index);
        }
    }
}