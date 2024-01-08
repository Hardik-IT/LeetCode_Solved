class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int res=0;
        if(x<0){
            return false;
        }
        while(temp!=0){
            res += temp%10;
            temp = temp/10;
            if(temp!=0)
                res = res*10;
        }
        if(res==x)
            return true;
        return false;    
    }
}