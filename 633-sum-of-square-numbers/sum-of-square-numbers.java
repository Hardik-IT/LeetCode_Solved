class Solution {
    public boolean judgeSquareSum(int c) {
        if(c < 0) return false;

        long l = 0;
        long r = (int) Math.sqrt(c);
        while(l <= r){
            long sum = l * l + r * r;
            if(sum == c){
                return true;
            }else if(sum < c){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }
}