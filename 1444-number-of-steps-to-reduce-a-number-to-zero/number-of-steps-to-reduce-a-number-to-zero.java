class Solution {
    public int numberOfSteps(int n) {
        return steps(n,0);
    }
    public int steps(int n,int c){
        if(n==0)
            return c;
        if(n%2==0){
            return steps(n/2,c+1);
        }else{
            return steps(n-1,c+1);
        }
    }
}