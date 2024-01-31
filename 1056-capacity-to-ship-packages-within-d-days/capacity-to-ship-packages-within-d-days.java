class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxI=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<weights.length;i++){
           sum += weights[i];
           maxI = Math.max(maxI,weights[i]);
        }
        int l=maxI,r=sum;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(findDaysReq(weights,mid) <= days){
                r=mid-1;
            }else{
                l=mid+1;
            }            
        }
        return l;
        // for(int j=maxI;j<=sum;j++){
        //    if(findDaysReq(weights,j) <= days){
        //        return j;
        //    }
        // }
        // return -1;
    }
    public int findDaysReq(int[] weights,int capacity){
        int day=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+load > capacity){
                day++;
                load=weights[i];
            }else{
                load+=weights[i];
            }
        }
        return day;
    }
}