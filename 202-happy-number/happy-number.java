class Solution {
    public boolean isHappy(int n) {
        // Set<Integer> collectInteger = new HashSet<>();
        // while(collectInteger.add(n))
        // {
        //     int res=0;
        //     while(n!=0){
        //         res+=(n%10)*(n%10);
        //         n=n/10; 
                
        //     }
        //     if(res==1)
        //        return true;
        //     else
        //         n=res;
    
        // }
        // return false;

        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);
        if(slow == 1){
            return true;
        }else{
            return false;
        }
    }
    public int findSquare(int number){
        int answer=0;
        while(number>0){
            int rem = number % 10;
            answer+= rem*rem;
            number=number/10;
        }
        return answer;
    }
}