class Solution {
    int t[][];
    public int findRotateSteps(String ring, String key) {
        t = new int[ring.length()][key.length()];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
       return solve(0,0,ring,key);
    }
    private int solve(int ringI,int keyI,String ring,String key){
        if(keyI == key.length()){
            return 0;
        }
        if (t[ringI][keyI] != -1) {
            return t[ringI][keyI];
        }
        int res = Integer.MAX_VALUE;
        for(int i=0; i < ring.length(); i++){
            if(ring.charAt(i)==key.charAt(keyI)){
                int totalSteps = countSteps(ringI,i,ring.length()) + 1 + solve(i,keyI+1,ring,key);
                res = Math.min(res,totalSteps);
            }
        }
        t[ringI][keyI] = res;
        return res;
    }
    private int countSteps(int ringI,int i,int n){
        int dist = Math.abs(i - ringI);
        int wrapA = n - dist;
        return Math.min(dist,wrapA);
    }
}