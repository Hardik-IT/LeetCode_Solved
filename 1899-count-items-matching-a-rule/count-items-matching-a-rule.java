class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // if(ruleKey !="type" || ruleKey !="color" || ruleKey !="name"){
        //     return 0;
        // }
        int count=0;
        int key=0;
        if(ruleKey.equals("type")){
            key=0;
        }
        if(ruleKey.equals("color")){
            key=1;
        }
        if(ruleKey.equals("name")){
            key=2;
        }     
        for(int i=0;i<items.size();i++){
            List<String> list=items.get(i);
            for(int j=0;j<list.size();j++){
                if(j==key){
                    if(list.get(j).equals(ruleValue))
                        count++;
                }
            }
        }
        return count;
    }
}