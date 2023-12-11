class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0; 
        stack.push(0);
        for(int i=1;i < heights.length;i++){
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                max = getMax(heights,stack, max, i);
            }
            stack.push(i);
        }
        int i = heights.length;
        while(!stack.isEmpty()){
            max = getMax(heights,stack, max, i);
        }
        return max;
    }
    public int getMax(int[] arr, Stack<Integer> stack,int max, int index){
        int area;
        int popped = stack.pop();
        if(stack.isEmpty()){
            area = arr[popped] * index;
        }else{
            area = arr[popped] * (index - 1 - stack.peek());
        }
        return Math.max(max, area);
    }
}