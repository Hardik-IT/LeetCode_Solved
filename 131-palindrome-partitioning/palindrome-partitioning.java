class Solution {
    // TC - O(N * 2^n)  
    List<List<String>> ans;
    public List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        partitionList(s,new ArrayList<>());
        return ans;
    }
    public void partitionList(String s,ArrayList<String> myCurrentPartition){
        if(s.length()==0){
            ans.add(new ArrayList<>(myCurrentPartition));
            return;
        }
        for(int i=1;i<=s.length();i++){
            String prefix = s.substring(0,i);
            if(isPallindrome(prefix)){
                String remaining = s.substring(i);
                myCurrentPartition.add(prefix);
                partitionList(remaining,myCurrentPartition);
                myCurrentPartition.removeLast();
            }
        }
    }
    public boolean isPallindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}