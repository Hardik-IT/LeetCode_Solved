class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int pSum = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            pSum += nums[i];
            
            int rem = pSum % k;
            if(rem < 0) rem = rem + k;
            if(hm.containsKey(rem)){
                count+=hm.get(rem);
                hm.put(rem,hm.get(rem)+1);
            }else{
                hm.put(rem,1);
            }
        }
        return count;
    }
}