class Solution {
    public String smallestGoodBase(String n) {
        Long num = Long.parseLong(n);
        for(int i=63;i>0;i--){
            long l=2,r=num-1;
            while(l<=r){
                long m = l + (r-l) / 2;
                long sum=0,x=1,flag=0;
                for(int j=0;j<=i;j++){
                    sum += x;
                    if(sum >= num) break;
                    else if(j<i && (num-sum)/m < x){
                        flag=1;
                        break;
                    } 
                    else if(j<i) {
                        x *= m;
                    }
                }
                if(sum > num || flag==1) r=m-1;
                else if(sum < num) l=m+1;
                else return Long.toString(m);
            }
        }
        return "";
    }
}