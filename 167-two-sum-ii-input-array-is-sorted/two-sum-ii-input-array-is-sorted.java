class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0,right = numbers.length-1;

        while(left < right){
            int currSum = numbers[left]+numbers[right];
            if(currSum==target){
                int[] res= new int[2];
                res[0] = left+1;
                res[1] = right + 1;
                return res;
            }else if(currSum < target) left++;
            else right--;
        }
        return null;
    }
}