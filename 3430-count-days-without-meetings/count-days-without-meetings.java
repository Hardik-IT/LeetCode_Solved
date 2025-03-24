class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int ans = 0;
        int last = 1;
        for (int i = 0; i < meetings.length; i++) {
            int s = meetings[i][0];
            int e = meetings[i][1];
            if (s > last) {
                ans += (s - last);
            }
            last = Math.max(last, e + 1);
        }
        if (days >= last) {
            ans += (days - last + 1);
        }
        return ans;
    }
}