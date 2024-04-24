class Solution {
    public int tribonacci(int n) {
        Map<Integer, Integer> memoMap = new HashMap<>();
        return helper(n, memoMap);
    }
    private int helper(int n,Map<Integer, Integer> memo){
        if(memo.containsKey(n))
            return memo.get(n);
        int res;
        if(n == 0) res = 0;
        else if(n == 1 || n == 2) res = 1;
        else res = helper(n-1,memo) + helper(n-2,memo) + helper(n-3,memo);
        memo.put(n,res);
        return res;
    }
}