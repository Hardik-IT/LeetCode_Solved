class Solution {
    public void moveZeroes(int[] a) {
            int n=a.length;
            int j=-1;
            for(int i=0;i<n;i++){
                if(a[i]==0){
                    j=i;
                    break;
                }
            }
            if(j==-1) return ;
            for(int i=j+1;i<n;i++){
                if(a[i]!=0){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                j++;
                }
            }
            
            
            
            
            // int n=a.length;
            // ArrayList<Integer> list = new ArrayList<>();

            // for(int i=0;i<n;i++){
            //     if(a[i]!=0)
            //     list.add(a[i]);
            // }
            // for(int i=0;i<list.size();i++){
            //     a[i]=list.get(i);
            // }
            // for(int i=list.size();i<n;i++){
            //     a[i]=0;
            // }
    }
}