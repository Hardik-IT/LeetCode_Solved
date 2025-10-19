class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        String min = s;
        q.offer(s);
        visited.add(s);

        while (!q.isEmpty()) {
            String cur = q.poll();

            if (cur.compareTo(min) < 0) {
                min = cur;
            }

            String addStr = add(cur, a);
            if (visited.add(addStr)) {  
                q.offer(addStr);
            }
            String rotStr = rotate(cur, b);
            if (visited.add(rotStr)) {
                q.offer(rotStr);
            }
        }
        return min;
    }
    public String add(String s1,int a){
        char[] arr = s1.toCharArray();
        for (int i = 1; i < arr.length; i += 2){
            int newDigit = (arr[i] - '0' + a) % 10;
            arr[i] = (char) (newDigit + '0');
        }
        s1 = new String(arr);
        return s1;
    }
    public String rotate(String s2,int b){
        int n = s2.length();
        String f;
           b = b % n; 
           String last = s2.substring(n - b);
           String first = s2.substring(0,n - b);
           f = last + first;
        return f;
    }

}