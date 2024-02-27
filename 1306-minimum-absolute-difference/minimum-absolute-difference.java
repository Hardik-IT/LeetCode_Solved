class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int curr_min_diff = arr[i+1] - arr[i];
            if(curr_min_diff < min_diff){
                min_diff = curr_min_diff;
                res.clear();
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }else if(curr_min_diff == min_diff)
                res.add(Arrays.asList(arr[i],arr[i+1]));
        }
        return res;
    }
}