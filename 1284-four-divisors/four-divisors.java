class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += isHavingFourDivisor(nums[i]);
        }
        return sum;
    }

    public int isHavingFourDivisor(int num){
        int count=0;
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
                sum +=i;
            }
            if(count > 4)
                break;
        }
        if(count==4) return sum;
        return 0;
    }
}