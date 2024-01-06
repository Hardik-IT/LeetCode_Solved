class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int min[] = new int[rectangles.length];
        for (int i = 0; i < rectangles.length; i++) {
            min[i] = Math.min(rectangles[i][0], rectangles[i][1]);
              
        }
        int max = 0;
        for (int i = 0; i < min.length; i++) {
            if (max < min[i])
                max = min[i];
             
        }
        int count = 0;
        for (int i = 0; i < min.length; i++) {
            if (max == min[i])
                count++;
        }
        return count;
    }
}
