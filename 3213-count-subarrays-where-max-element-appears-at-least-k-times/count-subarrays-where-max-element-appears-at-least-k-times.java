class Solution {
    public long countSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> fmap = new HashMap<>();
        int max = 0;
        for(int num : nums){
            max = Math.max(max,num);
        }
        int i=0,j=0;
        long ans = 0;
        int n = nums.length;
        while(j<n){
            if(!fmap.containsKey(nums[j]))
                fmap.put(nums[j],0);
            fmap.put(nums[j],fmap.get(nums[j])+1);
            while(fmap.getOrDefault(max,0) >= k){
                ans += n - j;
                fmap.put(nums[i],fmap.get(nums[i])-1);
                i++;
            }
            j++;
        }
        return ans;

    }
}