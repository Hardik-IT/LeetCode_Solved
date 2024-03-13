class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<students.length; i++){
            q.add(students[i]);
        }
        for(int i=0; i<sandwiches.length; i++){
            s.push(sandwiches[sandwiches.length-i-1]);
        }
        int hungryCount = 0;
        while(true){
            if(s.peek()==q.peek()){
                hungryCount=0;
                q.remove();
                s.pop();
            }else{
                hungryCount++;
                q.add(q.remove());
            }
            if(hungryCount==q.size()){
            break;
            }
        }
        return hungryCount;
    }
}