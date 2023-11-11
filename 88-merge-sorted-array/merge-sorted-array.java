class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;        
        for(int i=m;i<m+n;i++){
                nums1[i]=nums2[k];
                k++;
        }

        for (int i = 0; i < m+n; i++)   
        {  
            for (int j = i + 1; j < m+n; j++)   
            {  
                int tmp = 0;  
                if (nums1[i] > nums1[j])   
                {  
                tmp = nums1[i];  
                nums1[i] = nums1[j];  
                nums1[j] = tmp;  
                }  
            }  
        }
      
            System.out.print(nums1);
        
    }
}