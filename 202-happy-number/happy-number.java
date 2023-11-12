class Solution {
    public boolean isHappy(int n) {
        Set<Integer> collectInteger = new HashSet<>();
        while(collectInteger.add(n))
        {
            int res=0;
            while(n!=0){
                res+=(n%10)*(n%10);
                n=n/10; 
                
            }
            if(res==1)
               return true;
            else
                n=res;
    
        }
        return false;
    }
}