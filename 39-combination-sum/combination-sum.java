class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        findCombinations(0,candidates,target,new ArrayList<>());
        return ans;
    }
    public void findCombinations(int index,int[] candidates,int target,List<Integer> combination){
        if(index==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(combination));
            }
            return;
        }
        if(candidates[index] <= target){
            combination.add(candidates[index]);
            findCombinations(index,candidates,target-candidates[index],combination);
            combination.remove(combination.size()-1);
            
        }
        findCombinations(index+1,candidates,target,combination);
    }
}