class Solution {

    private static final int ALPHABET_SIZE = 26;
    private static final long INF = Long.MAX_VALUE / 2;
    
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {

        long[][] adjMatrix = new long[ALPHABET_SIZE][ALPHABET_SIZE];
        
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            Arrays.fill(adjMatrix[i], INF);
            adjMatrix[i][i] = 0; // Distance to itself is 0
        }
    
        for (int i = 0; i < original.length; i++) {
            int s = original[i] - 'a';
            int t = changed[i] - 'a';
            adjMatrix[s][t] = Math.min(adjMatrix[s][t], (long) cost[i]);
        }

        floydWarshall(adjMatrix);

        // Calculate the minimum cost to convert source to target
        long ans = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target.charAt(i)) {
                continue;
            }
            int srcChar = source.charAt(i) - 'a';
            int tgtChar = target.charAt(i) - 'a';
            if (adjMatrix[srcChar][tgtChar] == INF) {
                return -1;
            }
            ans += adjMatrix[srcChar][tgtChar];
        }
        return ans;
    }


    private void floydWarshall(long[][] adjMatrix) {
        for (int k = 0; k < ALPHABET_SIZE; k++) {
            for (int i = 0; i < ALPHABET_SIZE; i++) {
                for (int j = 0; j < ALPHABET_SIZE; j++) {
                    if (adjMatrix[i][k] < INF && adjMatrix[k][j] < INF) {
                        adjMatrix[i][j] = Math.min(adjMatrix[i][j], adjMatrix[i][k] + adjMatrix[k][j]);
                    }
                }
            }
        }
    }
}


