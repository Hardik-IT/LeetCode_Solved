import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> str = new ArrayList<String>();
        int temp=0;
            
        for(int i=0;i<nums.length;i++){
            int c=nums[i];
            while(i+1 <nums.length && nums[i+1]==nums[i]+1)   
                i++;
            if(nums[i]==c){
                str.add(c+""); 
            }else{
                str.add(c+"->"+nums[i]);
            }
        }
        System.out.println(str);
        return str;
    }
}