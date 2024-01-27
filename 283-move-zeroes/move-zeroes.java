class Solution {
    public void moveZeroes(int[] a) {
            int n=a.length;
           ArrayList<Integer> list = new ArrayList<>();

            for(int i=0;i<n;i++){
                if(a[i]!=0)
                list.add(a[i]);
            }
            for(int i=0;i<list.size();i++){
                a[i]=list.get(i);
            }
            for(int i=list.size();i<n;i++){
                a[i]=0;
            }
    }
}