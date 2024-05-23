class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            graph.get(v).add(u);
        }

        int[] indegree = new int[n];
        int[] topSort = new int[n];
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(Integer item : graph.get(i)){
                    indegree[item]++;
                
            }
        }
        int count = 0;
        
        for(int i=0;i<n;i++){
            if(indegree[i] == 0){
                q.add(i);
                count++;
            }
        }
        int idx = 0;
        while(!q.isEmpty()){
            Integer node = q.poll();
            topSort[idx] = node;
            idx++;
            for(int item : graph.get(node)){
                indegree[item]--;
                if(indegree[item]==0){
                    q.add(item);
                    count++;
                }
            }
        }
        if(count == numCourses)
            return topSort;
        return new int[]{};
    }
}