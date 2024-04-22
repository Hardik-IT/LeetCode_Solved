class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> deadendSet = new HashSet<>(Arrays.asList(deadends));
        String start = "0000";
        if(deadendSet.contains(start)) {
            return -1;
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size(); // Number of elements in the current level
            while (size-- > 0) {
                String current = queue.poll();
                if (current.equals(target)) {
                    return level;
                }
                fillNeighbors(queue, current, deadendSet);
            }
            level++;
        }
        return -1;
    }
    private void fillNeighbors(Queue<String> queue, String current, Set<String> deadendSet) {
        for (int i = 0; i < 4; i++) {
            char[] currentArray = current.toCharArray();
            char original = currentArray[i];
            // Decrement
            char dec = (char) (original == '0' ? '9' : original - 1);
            currentArray[i] = dec;
            String decremented = new String(currentArray);
            if (!deadendSet.contains(decremented)) {
                queue.offer(decremented);
                deadendSet.add(decremented); // Marked as visited
            }
            // Increment
            char inc = (char) (original == '9' ? '0' : original + 1);
            currentArray[i] = inc;
            String incremented = new String(currentArray);
            if (!deadendSet.contains(incremented)) {
                queue.offer(incremented);
                deadendSet.add(incremented); // Marked as visited
            }
            currentArray[i] = original; // Reset to original
        }
    }
}