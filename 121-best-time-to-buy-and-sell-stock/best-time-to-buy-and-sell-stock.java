class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n=prices.length;
        int min=prices[0]; // picking first element
        // int index=0;
        for(int i=0;i<n;i++)
        {       
                if(prices[i]<min){
                    min = prices[i];
                    // index=i;
                }else if(prices[i]-min>profit){
                    profit=prices[i]-min;
                }
        }
        // System.out.println(min);
        // System.out.println(index);
        // int tp=0;
        // for(int i=index;i<n;i++){
        //     if(min<prices[i]){
        //        tp=prices[i]-min;
        //         if(tp>profit){
        //             profit=tp;
        //         }                
        //     }
        // }
        return profit;
    }
}