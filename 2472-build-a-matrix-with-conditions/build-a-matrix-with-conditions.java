class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        
        List<Integer> topoRow = topoSort(rowConditions,k);
        List<Integer> topoCol = topoSort(colConditions,k);

         if (topoRow.isEmpty() || topoCol.isEmpty()) {
            return new int[0][0]; // Found cycle. Answer not possible
        }
        int[][] matrix = new int[k][k];

        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                if (topoRow.get(i).equals(topoCol.get(j))) {
                    matrix[i][j] = topoRow.get(i);
                }
            }
        }

        return matrix;
    }

    private List<Integer> topoSort(int[][] edges, int l) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            // u --> v
            adj.computeIfAbsent(u, m -> new ArrayList<>()).add(v);
        }

        List<Integer> visited = new ArrayList<>(Collections.nCopies(l + 1, 0)); 
        Stack<Integer> stack = new Stack<>();
        List<Integer> order = new ArrayList<>();
        boolean[] cycle = {false};

        for (int i = 1; i <= l; i++) {
            if (visited.get(i) == 0) {
                dfs(i, visited, adj, stack, cycle);
                if (cycle[0]) {
                    return new ArrayList<>(); // Found cycle
                }
            }
        }

        while (!stack.isEmpty()) {
            order.add(stack.pop());
        }

        return order;

    }

        private void dfs(int u, List<Integer> visited, Map<Integer, List<Integer>> adj, Stack<Integer> stack, boolean[] cycle) {
        visited.set(u, 1); // Mark node as visiting

        for (int v : adj.getOrDefault(u, Collections.emptyList())) {
            if (visited.get(v) == 0) {
                dfs(v, visited, adj, stack, cycle);
                if (cycle[0]) {
                    return;
                }
            } else if (visited.get(v) == 1) {
                cycle[0] = true; // Found a cycle
                return;
            }
        }

        visited.set(u, 2); // Mark node as visited
        stack.push(u);
    }

}

