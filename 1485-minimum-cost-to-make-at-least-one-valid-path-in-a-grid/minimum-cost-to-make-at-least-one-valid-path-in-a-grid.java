class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        int[][] cost = new int[m][n];
        for (int[] row : cost) {
            Arrays.fill(row, Integer.MAX_VALUE); 
        }

        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[]{0, 0}); 
        cost[0][0] = 0;

        while (!deque.isEmpty()) {
            int[] cell = deque.poll();
            int x = cell[0], y = cell[1];
            
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    int newCost = cost[x][y] + (grid[x][y] == dir + 1 ? 0 : 1);
                    if (newCost < cost[nx][ny]) {
                        cost[nx][ny] = newCost;
                        if (grid[x][y] == dir + 1) {
                            deque.offerFirst(new int[]{nx, ny}); 
                        } else {
                            deque.offerLast(new int[]{nx, ny}); 
                        }
                    }
                }
            }
        }
        return cost[m-1][n-1];
    }
    
}