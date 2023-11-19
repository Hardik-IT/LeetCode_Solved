class Solution {
    public int findPeakElement(int[] arr) {
       int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.length-1;
        while(start < end){

            int mid = start + (end-start)/2;
            System.out.println(mid);
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}