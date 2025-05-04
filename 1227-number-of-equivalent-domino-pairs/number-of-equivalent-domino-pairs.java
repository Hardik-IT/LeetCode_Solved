class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] counts = new int[100];
        int result = 0;
        for (int[] domino : dominoes) {
            int val1 = domino[0];
            int val2 = domino[1];
            
            int key = Math.min(val1, val2) * 10 + Math.max(val1, val2);
            result += counts[key];
            
            counts[key]++;
        }
        return result;
    }
}