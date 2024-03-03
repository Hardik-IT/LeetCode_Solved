public class Solution {
   public int maxPoints(int[][] points) {
        if (points.length <= 2) return points.length;

        int maxCount = 0;
        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> slopeCount = new HashMap<>();
            int ans = 2;
            for (int j = i + 1; j < points.length; j++) {
                int num = points[j][1] - points[i][1];
                int denom = points[j][0] - points[i][0];
                
                String slope = getFraction(num, denom);
                slopeCount.put(slope, slopeCount.getOrDefault(slope, 0) + 1);
            }
            for (int count : slopeCount.values()) {
                ans = Math.max(ans, count + 1);
            }
            maxCount = Math.max(maxCount, ans);
        }
        return maxCount;
    }
    
    private String getFraction(int num, int denom) {
        if (denom == 0) return "inf"; // Vertical line
        
        int gcd = gcd(num, denom);
        return (num / gcd) + "/" + (denom / gcd);
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
