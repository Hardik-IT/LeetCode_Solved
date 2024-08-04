class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] c1 = new int[1001];
        int[] c2 = new int[1001];
        for (int val : target) {
            c1[val]++;
        }
        for (int val : arr) {
            c2[val]++;
        }
        return Arrays.equals(c1, c2);
    }
}