class DisjointSets{
    int parent[];
    int size[];
    int components;
    DisjointSets(int nodes){
        this.parent = new int[nodes+1];
        this.size = new int[nodes+1];
        this.components = nodes;
        for(int i=0; i < nodes; i++){
            this.parent[i] = i;
            this.size[i] = 1;
        }
    }
    public int findRootParent(int node){
        if(node == parent[node]){
            return node;
        }
        parent[node] = findRootParent(parent[node]);
        return parent[node];
    }
    public int unionBySize(int node1,int node2){
            int rootParent1 = findRootParent(node1);
            int rootParent2 = findRootParent(node2);
            if(rootParent1 == rootParent2){
                return 0;
            }
            components--;
            if(size[rootParent1] < size[rootParent2]){
                parent[rootParent1] = rootParent2;
                size[rootParent2] += size[rootParent1];
            }else{
                parent[rootParent2] = rootParent1;
                size[rootParent1] += size[rootParent2];        
            }
            return 1;
    }


}
class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        DisjointSets alice = new DisjointSets(n);
        DisjointSets bob = new DisjointSets(n);
        int edgesReq = 0;
        for(int edge[] : edges){
            if(edge[0]==3){
                edgesReq += alice.unionBySize(edge[1],edge[2]) | bob.unionBySize(edge[1],edge[2]);
            }
        }
        for(int edge[] : edges){
            if(edge[0]==1){
                edgesReq += alice.unionBySize(edge[1],edge[2]);
            }
            if(edge[0]==2){
                edgesReq += bob.unionBySize(edge[1],edge[2]);;
            }
        }
        if(alice.components == 1 && bob.components == 1){
            return edges.length - edgesReq; 
        }
        return -1;
    }
}