class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int moreNeed = target - num;
            if(hashmap.containsKey(moreNeed)){
                res[0] = hashmap.get(moreNeed);
                res[1] = i;
                return res; 
            }
            hashmap.put(nums[i],i);
        }
        return res;
        
        // BRUTE TC - O(N^2) SC - O(1)
        // int[] res = new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             res[0]=i;
        //             res[1]=j;
        //         }
        //     }
        // }
        // return res;
    }
}