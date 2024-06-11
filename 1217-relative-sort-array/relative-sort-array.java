class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : arr1){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i) + 1);
            }else{
                hm.put(i,1);
            }
        }
        int res[] = new int[arr1.length];
        int count = 0;
        for(int j : arr2){
            while(hm.get(j) > 0){
                res[count] = j;
                count++;
                hm.put(j,hm.get(j) - 1);
            }
            hm.remove(j);
        }
        int rem[] = new int[arr1.length - count];
        int index = 0;
        for(int k : arr1){
            if(hm.containsKey(k)){
                while(hm.get(k) > 0){
                    rem[index] = k;
                    index++;
                    hm.put(k,hm.get(k) - 1);
                }
                hm.remove(k);
            }
        }
        Arrays.sort(rem);
        for(int x : rem){
            res[count] = x;
            count++;
        }
        return res;
    }
}