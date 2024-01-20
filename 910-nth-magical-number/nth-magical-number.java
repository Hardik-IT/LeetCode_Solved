class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        int mod = 1_000_000_007;
        long lcm = (long) a*b / gcd(a,b);
        
        long start= Math.min(a,b);
        long end = (long)1e18;
        while(start < end){
            long mid = start + (end-start)/2;
            long count = ((mid / a + mid / b) - mid / lcm);

            if(count < n){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return (int) (start % mod);
        

        

        // Brute Force got TLE
        // int mod = 1_000_000_007;
        // int count=0;
        // int i=1;
        // int ans=0;
        // while(count<n){
        //     if(i%a==0 || i%b==0){
        //         count++;
        //         ans=i;
        //     }
        //     i++;
        // }
        // return ans%mod;

    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b = a%b;
            a = temp; 
        }
        return a;
    }
}