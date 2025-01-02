class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n= queries.length;
        int wl = words.length;
        int v[] = new int[wl];
        int cnt=0;
        int ans[] = new int[n];
        for(String w : words){
            int len = w.length()-1;
            if((w.charAt(0) == 'a'  || w.charAt(0) == 'e' || w.charAt(0) == 'i' || w.charAt(0) == 'o' || w.charAt(0) == 'u') && (w.charAt(len) == 'a'  || w.charAt(len) == 'e' || w.charAt(len) == 'i' || w.charAt(len) == 'o' || w.charAt(len) == 'u')){
                    v[cnt] = 1;
            }else{
                v[cnt] = 0;
            }
            cnt++;
    
        }
        int c = 0;
        for(int q[] : queries){
            int s = q[0];
            int e = q[1];
            int sum = 0;
            for(int i=s;i<=e;i++){
                sum += v[i]; 
            }
            ans[c] = sum;
            c++;
        }
        return ans;
    }
}