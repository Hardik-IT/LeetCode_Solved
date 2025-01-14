class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        
        int n = A.length;
        int[] ans = new int[n];
        int matchCount = 0;
        int x = 0;
        for(int i=0;i<n;i++){
            setA.add(A[i]);
            setB.add(B[i]);
            if(A[i] == B[i])
            {
                matchCount++;
            }else{
            if(setB.contains(A[i]))
                matchCount++;
            if(setA.contains(B[i]))
                matchCount++;
            }
            ans[x] = matchCount;
            x++;
        }
        return ans;
    }
}