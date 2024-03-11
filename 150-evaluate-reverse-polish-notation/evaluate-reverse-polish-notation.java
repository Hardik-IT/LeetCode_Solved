class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            switch(token){
                case "+" :
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    stack.push(num1 - num2);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int denom = stack.pop();
                    int num = stack.pop();
                    stack.push(num / denom);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.pop().intValue();
    }
}