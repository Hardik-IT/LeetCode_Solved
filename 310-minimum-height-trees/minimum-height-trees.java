class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] indegree = new int[n];
        List<Integer> result = new ArrayList<>();
        if(n == 1) {
            result.add(0); 
            return result;
        }   
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            indegree[u]++;
            indegree[v]++;
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        Queue<Integer> que = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 1) {
                que.offer(i);
            }
        }
        
        while (n > 2) {
            int size = que.size();
            n -= size;
            while (size-- > 0) {
                int u = que.poll();
                for (int v : adj.get(u)) {
                    indegree[v]--;
                    if (indegree[v] == 1) {
                        que.offer(v);
                    }
                }
            }
        }
        
        while (!que.isEmpty()) {
            result.add(que.poll());
        }
        
        return result;
    }
}