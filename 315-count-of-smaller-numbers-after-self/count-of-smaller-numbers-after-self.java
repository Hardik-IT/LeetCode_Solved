class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int num : nums){
            res.add(num);
        }
        Collections.sort(res);
        for(int i=0;i<nums.length;i++){
            int idx = getIndex(res,nums[i]);
            ans.add(idx);
            res.remove(idx);
        }
        return ans;
    }
    public int getIndex(ArrayList<Integer> res,int target){
        int start = 0;
        int end = res.size()-1;
        int mid=0;
        
        while(start<=end){
            mid = start + ((end - start)/2);
            int val = res.get(mid);
            if(val<target) start = mid + 1;
            else end = mid - 1;
        }
        if(res.get(start) == target) return start;
        return mid;
    }
}