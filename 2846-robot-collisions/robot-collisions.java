class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> res = new ArrayList<>();
        int n = positions.length;
        Integer[] actualIdx= new Integer[n];
        for (int i = 0; i < n; i++) {
            actualIdx[i] = i;
        }
        Arrays.sort(actualIdx, Comparator.comparingInt(i -> positions[i]));
        
        
        Stack<Integer> stack = new Stack<>();

        for(int currIdx : actualIdx){
            if(directions.charAt(currIdx)=='R'){
                stack.push(currIdx);
            }else{
                while(!stack.isEmpty() && healths[currIdx] > 0){
                    int topIdx = stack.pop();
                     if (healths[topIdx] > healths[currIdx]) {
                        healths[topIdx] -= 1;
                        healths[currIdx] = 0;
                        stack.push(topIdx);
                    } else if (healths[topIdx] < healths[currIdx]) {
                        healths[currIdx] -= 1;
                        healths[topIdx] = 0;
                    } else {
                        healths[currIdx] = 0;
                        healths[topIdx] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) {
                res.add(healths[i]);
            }
        }

        return res;

    }
}