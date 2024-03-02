class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> freqMapT = new HashMap<>();
            for(int i=0;i<t.length();i++){
                freqMapT.put(t.charAt(i), freqMapT.getOrDefault(t.charAt(i),0) + 1 );
            }    
        String ans="";
        int mct = 0;
        int dmct= t.length();
        HashMap<Character,Integer> freqMapS = new HashMap<>();
        int i=-1;
        int j=-1;
        while(true)
        {
            boolean f1=false,f2=false;
            //acquire
            while(i < s.length() - 1 && mct < dmct){
                i++;
                char ch = s.charAt(i);
                freqMapS.put(ch, freqMapS.getOrDefault(ch,0) +1 );

                if(freqMapS.getOrDefault(ch,0) <= freqMapT.getOrDefault(ch,0)){
                    mct++;
                }
                f1=true;
            }
            //release and collect ans
            while(j < i && mct == dmct){
                String pans = s.substring(j+1,i+1);
                if(ans.length() == 0 || pans.length() < ans.length()){
                    ans = pans;
                }
                j++;
                char ch = s.charAt(j);
                if(freqMapS.get(ch) == 1){
                    freqMapS.remove(ch);
                }else{
                    freqMapS.put(ch,freqMapS.get(ch) - 1);
                }
                if(freqMapS.getOrDefault(ch,0) < freqMapT.getOrDefault(ch,0)){
                    mct--;
                }
                f2=true;
            }
            if(f1==false && f2==false) break; 
        }
        return ans;
    }
}