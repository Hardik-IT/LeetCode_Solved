class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i=0,j=0;
        List<Integer> nums3= new ArrayList<>();
        while(i<n1 && j<n2){
            if(nums1[i] < nums2[j]){
                nums3.add(nums1[i++]);
            }else{
                nums3.add(nums2[j++]);
            }
        }

        while(i < n1){
            nums3.add(nums1[i++]);
        }
        while(j < n2){
            nums3.add(nums2[j++]);
        }

        int n = n1+n2;
        if(n%2==0){
            double median = ((double) ((nums3.get(n/2-1)) + (double)nums3.get(n/2) )) / 2;
        return median>0?median:0;
            
        }
            return nums3.get(n/2);

        
    }
}