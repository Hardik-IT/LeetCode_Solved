class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            boolean flag=true;
            for(int j=0;j<candies.length;j++){
                if(candies[i]+extraCandies >= candies[j]){
                   flag=true;
                }else{
                    flag= false;
                    break;
                }
           }
           if(flag==true){
               list.add(true);
           }else{
               list.add(false);
           }
        }   
        return list;
    }
}