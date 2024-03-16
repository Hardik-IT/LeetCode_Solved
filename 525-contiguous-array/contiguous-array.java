class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int subArrayL = 0;
        for(int i=0;i<n;i++){
            sum += nums[i] == 0 ? -1 : 1;
            if(sum==0){
                subArrayL = i + 1;
            }else if(map.containsKey(sum)){
                subArrayL = Math.max(subArrayL, i - map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return subArrayL;
        // int cZ=0,cO=0,maxL=0;
        // for(int i=0;i<nums.length;i++){
        //     cZ=0;
        //     cO=0;
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         if(nums[j]==0) cZ++; else cO++;
        //         if(cZ==cO)
        //             maxL=Math.max(maxL,cZ+cO);
        //     }
        // }
        // return maxL;
    }
}