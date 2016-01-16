package BestTimeToBuyandSellStock;

public class Solution {

	public static void main(String[] args) {
		Solution so = new Solution();
		// TODO Auto-generated method stub
		int[] prices = {1,4,2};
		int result = so.maxProfit(prices);
		System.out.println(result);
	}

	public int maxProfit(int[] prices) {
		
		int profit = 0;		
		int minPos = 0;
		
		for(int i=0,len = prices.length; i<len; i++) {
			if(prices[i]<prices[minPos]){
				minPos = i;
			}
			int tmpProfit = prices[i] - prices[minPos];	
			if(tmpProfit> profit){
				profit = tmpProfit;
			}
		}
		return profit;
	}

}
