import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             if(Math.abs(i-j)<=k){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;

        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                if(Math.abs(hm.get(nums[i])-i)<=k)
                    return true;
                else                     
                    hm.put(nums[i],i);

            }else
                hm.put(nums[i],i);
        } 
        return false;
    }
}