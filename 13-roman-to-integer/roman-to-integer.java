import java.util.Hashtable;
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        Hashtable<String,Integer> romanTable = new Hashtable<>();

        romanTable.put("I",1);
        romanTable.put("V",5);
        romanTable.put("X",10);
        romanTable.put("L",50);
        romanTable.put("C",100);
        romanTable.put("D",500);
        romanTable.put("M",1000);

        char[] charArr = s.toCharArray();
        

        for(int i=0;i<charArr.length;i++){
            if((i+1)<charArr.length && (romanTable.get(""+charArr[i])) < (romanTable.get(""+charArr[i+1]))){
                sum -= romanTable.get(""+charArr[i]);
               }else{
                    sum += romanTable.get(""+charArr[i]);
                }
        }
        return sum;
    }
}