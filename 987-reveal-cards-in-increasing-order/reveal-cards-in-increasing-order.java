class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
         Arrays.sort(deck); 
        Queue<Integer> idxqueue = new LinkedList<>();
        for (int i = 0; i < deck.length; i++) {
            idxqueue.add(i);
        }
        
        int[] ans = new int[deck.length];
        int c = 0; 
        while (!idxqueue.isEmpty()) {
            ans[idxqueue.poll()] = deck[c++];
            if (!idxqueue.isEmpty()) {
                idxqueue.add(idxqueue.poll());
            }
        }
        
        return ans; 
    }
}