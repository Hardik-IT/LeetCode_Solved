class Solution {
    private void DFS(int ancestor, Map<Integer, List<Integer>> adj, int currNode, List<List<Integer>> result) {
        for (int neighbor : adj.getOrDefault(currNode, new ArrayList<>())) {
        
            if (result.get(neighbor).isEmpty() || result.get(neighbor).get(result.get(neighbor).size() - 1) != ancestor) {
                result.get(neighbor).add(ancestor);
                DFS(ancestor, adj, neighbor, result);
            }
        }
    }

    public List<List<Integer>> getAncestors(int n, int[][] edges) {

        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> adj = new HashMap<>();

        for (int i = 0; i < n; i++) {
            result.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (!adj.containsKey(u)) {
                adj.put(u, new ArrayList<>());
            }
            adj.get(u).add(v); 
        }

        for (int i = 0; i < n; i++) {
            DFS(i, adj, i, result);
        }

        return result;
    }
}