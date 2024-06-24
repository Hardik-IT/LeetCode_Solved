class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length; 
        int flip = 0;
        int res = 0;
        int isFlip[] = new int[n];
        for(int i=0;i<n;i++){
                if(i >= k)
                flip ^= isFlip[i-k];
                if(flip == nums[i]){
                    if(i+k > n)
                        return -1;
                    isFlip[i] = 1;
                    flip ^= 1;
                    res++;
                }
        }
        return res;
    }
}