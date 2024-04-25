class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int startI = 0;
        int n = gas.length;
        int totalG=0;
        int availG=0;

        for(int i=0;i<n;i++){
            totalG = totalG + gas[i] - cost[i];
            availG = availG + gas[i] - cost[i];
            if(availG < 0){
                availG = 0;
                startI = i+1;
            }
        }
        if(totalG < 0)
            return -1;
        return startI;
    }
}