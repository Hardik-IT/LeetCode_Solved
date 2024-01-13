class Solution {
    public int findMin(int[] arr) {
        int min=Integer.MAX_VALUE;
        int n = arr.length; // size of the array.
        for (int i = 0; i < n; i++) {
            min = Math.min(min,arr[i]);
        }
        return min;
    }
}