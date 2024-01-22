class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int countF=0;
        int countL=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    countF++;
                    break;
                }
            }
        }

        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    countL++;
                    break;
                }
            }
        }
        int[] newArr = new int[2]; 
        newArr[0]=countF;
        newArr[1]=countL;
        return newArr;
    }
}