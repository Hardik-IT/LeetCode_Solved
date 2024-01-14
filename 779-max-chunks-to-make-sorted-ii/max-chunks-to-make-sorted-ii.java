class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int[] maxL=new int[n];
        int[] minR=new int[n];
        maxL[0]=Integer.MIN_VALUE;
        minR[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            maxL[i] = Math.max(maxL[i-1],arr[i-1]);
        }
        for(int i=n-2;i>=0;i--){
             minR[i] = Math.min(minR[i+1],arr[i]);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(maxL[i] <= minR[i]){
                count++;
            }
        }
        return count;
    }
}