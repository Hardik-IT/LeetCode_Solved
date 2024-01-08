class Solution {
    public int reverse(int x) {
        
        int temp = x;
        long sum=0;
        while(temp!=0){
            int rem = temp%10;
            sum = sum*10;
            sum += rem;
            temp=temp/10;
        }
        if(sum > Integer.MAX_VALUE || sum<Integer.MIN_VALUE){
            return 0;
        }
       
        return (int)sum;
    }
}