class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            maxHeap.add(happiness[i]);
        }
        long maxHappiness = 0;
        for(int i=0; i<k; i++){
            maxHappiness += Math.max(maxHeap.poll()-i,0);
        }

        return maxHappiness;



    }
}