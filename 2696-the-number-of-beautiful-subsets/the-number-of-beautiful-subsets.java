class Solution {
    int res;
    int K;
    public int beautifulSubsets(int[] nums, int k) {
        res = -1;
        K = k;
        Map<Integer,Integer> map = new HashMap<>();
        solve(0,nums,map);
        return res; 
    }
    public void solve(int index,int[] nums,Map<Integer,Integer> map){
        if(index >= nums.length){
            res++;
            return;
        }
        //not taking element
        solve(index+1,nums,map);
        // taking
        int curr = nums[index];
        if(!map.containsKey(curr - K) && !map.containsKey(curr + K))
        {
            map.put(curr , map.getOrDefault(curr,0)+1);
            solve(index+1,nums,map);
            map.put(curr, map.get(curr)-1);
            if (map.get(curr) == 0) {
                map.remove(curr);
            }
        }
    }
}