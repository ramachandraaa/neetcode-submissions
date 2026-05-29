class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int j=0;
        int i=1;
        int maxprofit=0;
        if (n==1)
        {
            return 0;
        }
        int profit=prices[i]-prices[j];

        while(i<n)   
        {

            profit=prices[i]-prices[j];
            maxprofit=Math.max(maxprofit,profit);
            i++;
            if(prices[i-1]<prices[j])
            {
                j=i-1;
            }
        }
              return maxprofit;  
               
    }
} 
