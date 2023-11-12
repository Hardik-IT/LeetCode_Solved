class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // StringBuilder res = new StringBuilder();

        // Arrays.sort(strs);

        // char[] first = strs[0].toCharArray();
        // char[] last = strs[strs.length-1].toCharArray();

        // for(int i=0;i<first.length;i++){
        //     if(first[i] != last[i])
        //         break;
        //     res.append(first[i]);
        // }
        // return res.toString();
        

        if(strs.length==0) return "";
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}