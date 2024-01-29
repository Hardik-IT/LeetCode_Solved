class Solution {
    public int longestConsecutive(int[] nums) {
        
        // TC O(3N) SC O(N) 
        int n=nums.length;
        if(n==0) return 0;
        int longest=1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int it : set){
            if(!set.contains(it-1)){
                int count=1;
                int x = it;
                while(set.contains(x+1)){
                    x=x+1;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;        


        
        
        
        // Better TC O(N log N) + O(N) SC O(1)
        // int n=nums.length;
        // if(n==0) return 0;
        // Arrays.sort(nums);
        // int lastSmaller=Integer.MIN_VALUE;
        // int count=0;
        // int longest=1;   
        // for(int i=0;i<n;i++){
        //     if(nums[i]-1==lastSmaller){
        //         count++;
        //         lastSmaller=nums[i];
        //     }else if(nums[i]!=lastSmaller){
        //         count=1;
        //         lastSmaller=nums[i];
        //     }
        //     longest=Math.max(longest,count);
        // }
        // return longest;
    }
}