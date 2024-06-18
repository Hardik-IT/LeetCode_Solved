class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxDiff = 0;
        for (int d : difficulty) {
            maxDiff = Math.max(maxDiff, d);
        }
        int[] maxProfitUpToDiff = new int[maxDiff + 1];
        for (int i = 0; i < difficulty.length; i++) {
            maxProfitUpToDiff[difficulty[i]] = Math.max(maxProfitUpToDiff[difficulty[i]], profit[i]);
        }
        for (int i = 1; i <= maxDiff; i++) {
            maxProfitUpToDiff[i] = Math.max(maxProfitUpToDiff[i], maxProfitUpToDiff[i - 1]);
        }
        int totalProfit = 0;
        for (int ability : worker) {
            if (ability > maxDiff) {
                totalProfit += maxProfitUpToDiff[maxDiff];
            } else {
                totalProfit += maxProfitUpToDiff[ability];
            }
        }

        return totalProfit;
    }
}