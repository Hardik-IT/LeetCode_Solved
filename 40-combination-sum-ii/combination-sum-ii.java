class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0,candidates,target,new ArrayList<>());
        return ans;
    }
    public void findCombinations(int index,int[] candidates,int target,List<Integer> combination){
        if(target==0){
            ans.add(new ArrayList<>(combination));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i > index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
            combination.add(candidates[i]);
            findCombinations(i+1,candidates,target-candidates[i],combination);
            combination.remove(combination.size()-1);      
        }
    }
}