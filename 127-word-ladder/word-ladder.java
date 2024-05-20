class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if(!wordList.contains(endWord)){
            return 0;
        }

        Set<String> set = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int len =1;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i=0;i<size;i++){
                String curr = queue.poll();
                if(curr.equals(endWord)){
                    return len;
                }
                for (int j=0;j<curr.length();j++){
                    char temp[] = curr.toCharArray();
                    for (char c='a';c  <= 'z'; c++){
                        temp[j] = c;
                        String newWord = new String(temp);
                        if(set.contains(newWord)){
                            queue.offer(newWord);
                            set.remove(newWord);
                        }
                    }
                }
            }
            len++;
        }
        return 0;
    }
}