class Solution {
    private void dfs(int node, List<List<Integer>> adj, boolean[] visited, Set<Pair<Integer, Integer>> prereq, int start) {
        visited[node] = true;

        // Add the pair (start, node) to the set if `start` is not -1
        if (start != -1) {
            prereq.add(new Pair<>(start, node));
        }

        // Explore all neighbors of the current node
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, prereq, start);
            }
        }
    }
    
    public List<Boolean> checkIfPrerequisite(int n, int[][] pre, int[][] q) {
    
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] p : pre) {
            adj.get(p[0]).add(p[1]);
        }

        Set<Pair<Integer, Integer>> prerequisites = new HashSet<>();
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            dfs(i, adj, visited, prerequisites, i);
        }

        List<Boolean> result = new ArrayList<>();
        for (int[] query : q) {
            result.add(prerequisites.contains(new Pair<>(query[0], query[1])));
        }
        return result; 
    }
}
