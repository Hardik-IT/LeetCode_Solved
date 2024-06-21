class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int winSum = 0;
        int zeroSum = 0;
        int maxWinSum = 0;
        for(int i=0;i<n;i++){
            if(grumpy[i] == 0) zeroSum += customers[i];
            if(i < minutes){
                winSum+=(grumpy[i] == 1 ? customers[i] : 0);
            }else{
                winSum += (grumpy[i] == 1 ? customers[i] : 0) - (grumpy[i-minutes] == 1 ? customers[i-minutes] : 0);
            }
            maxWinSum = Math.max(winSum,maxWinSum);
        }
        return maxWinSum + zeroSum;
    }
}