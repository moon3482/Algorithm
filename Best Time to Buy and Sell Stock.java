class Solution {
    public int maxProfit(int[] prices) {
        int re = 0;
        if(prices.length == 0 ){
            return 0;
        }
		int bought=prices[0];                                
            for(int i=1;i<prices.length;i++)
            {
                if(prices[i]>bought)
                {
                    if(re<(prices[i]-bought))
                    {
                        re=prices[i]-bought;
                    }
                }
                else
                {
                    bought=prices[i];
                }
            }
            
            
		

		return re;
    }
}
