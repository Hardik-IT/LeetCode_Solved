class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffle=new int[nums.length];
        int i = 0;
        int j = n;
        int c = 0;
        while(i<n){
            shuffle[c]=nums[i];
            shuffle[c+1]=nums[j];
            c+=2;
            i++;
            j++;
        }
        return shuffle;
    }
}