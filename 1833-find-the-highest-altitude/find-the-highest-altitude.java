class Solution {
    public int largestAltitude(int[] gain) {
        int high=0;
        int alt=0;
        for(int i=0;i<gain.length;i++){
            alt+=gain[i];
            // System.out.println(alt);
            high=Math.max(alt,high);
        }
        return high;
    }
}