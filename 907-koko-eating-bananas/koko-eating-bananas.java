class Solution {

    public int calculateHours(int piles[],int h){
        int n=piles.length;
        int totalH = 0;
        for(int i=0;i<n;i++){
            totalH += Math.ceil((double)(piles[i])/(double)(h));
        }
        return totalH;
    }

    public int minEatingSpeed(int[] piles, int h) {
       int max = Integer.MIN_VALUE;
       for(int i=0;i<piles.length;i++){
           if(piles[i]>max){
               max=piles[i];
           }
       }
       int s = 0;
       int e = max;
       while(s <= e){
           int m = (s+e)/2;
           int totalH = calculateHours(piles, m);
           if(totalH <= h){
               e= m - 1;
           }else{
               s= m + 1;
           }
       }
       return s;


    }
}