class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] visited = new boolean[n];
        return dfs(graph, visited, source, destination);
    }
     public boolean dfs(List<List<Integer>> graph, boolean[] visited, int current, int end) {
        if (current == end)
            return true;
        if (visited[current])
            return false;
        visited[current] = true;
        for (int i = 0; i < graph.get(current).size(); i++) {
            if (dfs(graph, visited, graph.get(current).get(i), end))
                return true;
        }
        return false;
    }

}