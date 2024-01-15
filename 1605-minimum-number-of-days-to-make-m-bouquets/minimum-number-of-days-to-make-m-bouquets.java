class Solution {
    public boolean possible(int[] bloomDay,int d,int m,int k){
        int cnt=0;
        int nOfB=0;
        int n=bloomDay.length;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=d){
                cnt++;
            }else{
                nOfB += (cnt/k);
                cnt=0;
            }
        }
        nOfB += cnt/k;
        return nOfB >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        int n=bloomDay.length;
        if (val > n) return -1;
        int maxI = Integer.MIN_VALUE;
        int minI = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minI = Math.min(minI, bloomDay[i]);
            maxI = Math.max(maxI, bloomDay[i]);
        }
        int s = minI;
        int e = maxI;
        while(s <= e){
            int mid = (s+e)/2;
            if(possible(bloomDay,mid,m,k)){
                e = mid - 1;        
            }else{
                s = mid + 1;
            }
        }


        // TLE
        // for(int i=minI;i<=maxI;i++){
        //     if(possible(bloomDay,i,m,k)==true)
        //         return i;
        // }
        return s;
    }
}