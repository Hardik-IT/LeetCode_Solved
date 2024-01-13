class Solution {
    public boolean search(int[] arr, int k) {
       int n = arr.length; // size of the array.
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) return true;
        }
        return false;
    }
    
}