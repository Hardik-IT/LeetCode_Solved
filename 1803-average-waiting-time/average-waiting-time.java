class Solution {
    public double averageWaitingTime(int[][] customers) {
        int currTime = 0;
        double totalWaitingTime = 0;
        int n = customers.length;
           
        for(int[] cust : customers){
            int arrTime = cust[0];
            int cookTime = cust[1];
            if(currTime < arrTime){
                currTime = arrTime;
            }
            int waitTime = currTime + cookTime - arrTime;
            totalWaitingTime += waitTime;
            currTime += cookTime;
        }
        return totalWaitingTime / n;
    }
}