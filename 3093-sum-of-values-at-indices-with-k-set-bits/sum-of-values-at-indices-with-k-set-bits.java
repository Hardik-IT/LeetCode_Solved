class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int res=0;
        for(int i=0;i<nums.size();i++){
            if(isBinaryEqualtok(i,k)){
                res+=nums.get(i);
            }
        }
        return res;
    }
    public static boolean isBinaryEqualtok(int num,int k){
        int sum=0;
        while(num > 0){
            sum += num%2;
            num = num/2;
        }
        return sum==k;
    }
}