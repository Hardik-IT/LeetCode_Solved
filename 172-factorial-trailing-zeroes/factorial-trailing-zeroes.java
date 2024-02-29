class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        int powOf5 = 5;
        while(n >= powOf5){
            count = count + (n/powOf5);
            powOf5 = powOf5*5;
        }
        return count;
    }
}