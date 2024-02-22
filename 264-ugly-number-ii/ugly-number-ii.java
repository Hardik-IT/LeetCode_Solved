class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        int idx2=0,idx3=0,idx5=0;
        int nextMof2 = 2;
        int nextMof3 = 3;
        int nextMof5 = 5;
        ugly[0]=1;
        for(int i = 1; i < ugly.length; i++){
            int nextUglyNo = Math.min(nextMof2,Math.min(nextMof3,nextMof5));
            ugly[i] = nextUglyNo;
            if(nextUglyNo == nextMof2){
                nextMof2 = ugly[++idx2] * 2;
            }
            if(nextUglyNo == nextMof3){
                nextMof3 = ugly[++idx3] * 3;
            }
            if(nextUglyNo == nextMof5){
                nextMof5 = ugly[++idx5] * 5;
            }
        }
        return ugly[n-1];

    }
}