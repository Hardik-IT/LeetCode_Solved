class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int res=0;
        while(a-b >= 0){
            int x=0;
            while( (a - (b << 1 << x)) >= 0 ){
                x++;
            }
            res += 1 << x;
            a -= b << x; 
        }
        return (dividend >= 0) == (divisor >= 0) ? res :-res;


        // int step=0;
        // int sign=1;
        // if(dividend < 0 && divisor < 0){
        //     sign=1;
        // }else{
        //     if(dividend < 0){
        //         sign=-1;
        //         dividend = -dividend;
        //     }
        //     if(divisor < 0){
        //         sign=-1;
        //         divisor = -divisor;
        //     }
        // }      
        // while(divisor <= dividend){
        //     step++;
        //     dividend-=divisor;
        // }
        // return sign*step;
    }
}