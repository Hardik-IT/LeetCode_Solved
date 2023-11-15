class Solution {
    public boolean isPalindrome(int x) {
        int temp=0,rem=0;
        int res=x;
        while(x>0){
            rem=x%10;
            x=x/10;
            temp=temp*10+rem;
        }
        System.out.println(temp+ " "+res);
        if(res==temp){
            return true;
        }else{
            return false;
        }

    }
}