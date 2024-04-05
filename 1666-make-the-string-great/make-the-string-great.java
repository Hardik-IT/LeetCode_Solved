class Solution {
    // TC O(n) SC O(n)
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && Math.abs(c - st.peek()) == 32){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty())
            res.insert(0,st.pop());
        
        return res.toString();
       
    }
}