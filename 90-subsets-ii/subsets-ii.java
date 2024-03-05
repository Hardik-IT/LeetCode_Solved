class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        return helper(nums,0);
    }
    public List<List<Integer>> helper(int[] nums,int start){
        List<List<Integer>> myAns = new ArrayList<>();
        myAns.add(new ArrayList<>());
        for(int i=start;i<nums.length;i++){   
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }    
            List<List<Integer>> recRes = helper(nums,i+1);;
            for(List<Integer> recSubset : recRes){
                List<Integer> currAns = new ArrayList<>();
                currAns.add(nums[i]);
                currAns.addAll(recSubset);
                myAns.add(currAns);
            }
        }
        return myAns;
    }
}