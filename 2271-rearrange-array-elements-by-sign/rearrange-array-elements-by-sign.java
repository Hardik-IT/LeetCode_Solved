class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res=new int[nums.length];
        int negI=1;
        int posI=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[posI]=nums[i];
                posI+=2;
            }else{
                res[negI]=nums[i];
                negI+=2;
            }
        }
        return res;
       
        // List<Integer> pos = new ArrayList<>();
        // List<Integer> neg = new ArrayList<>();

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0){
        //         neg.add(nums[i]);
        //     }else{
        //         pos.add(nums[i]);
        //     }
        // }

        // for(int i=0;i<nums.length/2;i++){
        //     nums[2*i]=pos.get(i);
        //     nums[2*i+1]=neg.get(i);
        // }
        // return nums;
    }
}