class Solution {
    public int countPalindromicSubsequence(String s) {

        // TLE Approach begginner
        // Map<String,Integer> map = new HashMap<>();
        // if(s.length() < 3){
        //     return 0;
        // }
        // if(s.length() == 3){
        //     if(s.charAt(0) == s.charAt(2)){
        //         return 1;
        //     }
        // }
        // int n = s.length();
        // for(int i=0;i<n-2; i++){
        //     for(int j=i+1;j<n-1; j++){
        //         for(int k=j+1;k<n;k++){
        //             String currStr = ""+s.charAt(i) +""+ s.charAt(j) +""+ s.charAt(k);
        //             if(currStr.charAt(0) == currStr.charAt(2)){
        //                     map.put(currStr,1);
        //             }
        //         }
        //     }
        // }
        // return map.size();
    
        // int n = s.length();
        // if (n < 3) return 0;

        // Set<Character>[] leftSeen = new HashSet[n];
        // Set<Character>[] rightSeen = new HashSet[n];
    
        // for (int i = 0; i < n; i++) {
        //     leftSeen[i] = new HashSet<>();
        //     rightSeen[i] = new HashSet<>();
        // }

        // for (int i = n - 2; i >= 0; i--) {
        //     rightSeen[i].addAll(rightSeen[i + 1]);
        //     rightSeen[i].add(s.charAt(i + 1));
        // }
    
        //   Set<String> uniquePalindromes = new HashSet<>();

        // for (int j = 1; j < n - 1; j++) {
        //     char middleChar = s.charAt(j);

        //     for (int i = 0; i < j; i++) {
        //         leftSeen[j].add(s.charAt(i));
        //     }

        //     for (char c : leftSeen[j]) {
        //         if (rightSeen[j].contains(c)) {
        //             uniquePalindromes.add(c + "" + middleChar + c);
        //         }
        //     }
        // }

        // return uniquePalindromes.size();

        int n = s.length();
        int ans =0;
        Set<Character> unique = new HashSet<>();
        for(char c:s.toCharArray()) {
            unique.add(c);
        }
         for(char ch:unique) {
            int first =-1;
            int last =-1;
            for(int i=0;i<n;i++) {
                if(ch == s.charAt(i)) {
                    if(first == -1) {
                        first =i;
                    }
                    last =i;
                }
            }

            Set<Character> set = new HashSet<>();
            for(int j=first+1;j<last;j++) {
                set.add(s.charAt(j));
            }
            ans +=set.size();
        }
        return ans;
    }
}





