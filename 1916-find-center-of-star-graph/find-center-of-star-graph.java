class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> outEdgesCount = new HashSet<>();
        for(int[] edge : edges){
            if(outEdgesCount.contains(edge[0]))
                return edge[0];
            outEdgesCount.add(edge[0]);
            if(outEdgesCount.contains(edge[1]))
                return edge[1];
            outEdgesCount.add(edge[1]);
        }
        return -1;
    }
}