class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] frequency = new int[n + 1];
        for (int num : nums) {
            frequency[Math.min(n, num)]++;
        }
        int x = 0;
        for(int i=n; i>0; i--){
            x+= frequency[i];
            if(i == x){
                return i;
            }
        }   
        return -1;

    }
}