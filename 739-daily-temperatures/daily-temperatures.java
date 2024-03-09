class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> days = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!days.isEmpty() && temperatures[days.peek()] < temperatures[i]){
                res[days.peek()] = i - days.pop();
            }
            days.push(i);
        }
        return res;
    }
}