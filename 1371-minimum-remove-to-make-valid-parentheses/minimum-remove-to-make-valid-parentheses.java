class Solution {
    public String minRemoveToMakeValid(String s) {
        int leftCount = 0;
        int rightCount = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char currChar = s.charAt(i);
            if(currChar == '('){
                leftCount++;
            }
            if(currChar ==')')
            {
                rightCount++;
            }
            if(rightCount > leftCount){
                rightCount--;
                continue;
            }else{
                st.push(currChar);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            char currC = st.pop();
            if (leftCount > rightCount && currC == '(') {
                leftCount--; 
            } else if (currC == ')' && rightCount > leftCount) {
                rightCount--;
            } else {
                res.append(currC);
            }
        }
        return res.reverse().toString();
    }
}