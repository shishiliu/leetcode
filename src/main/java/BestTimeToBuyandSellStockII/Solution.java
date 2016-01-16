package BestTimeToBuyandSellStockII;


public class Solution {
	public static void main(String[] args) {
		Solution so = new Solution();
		// TODO Auto-generated method stub
		int[] prices = {1,2,4};
		int result = so.maxProfit(prices);
		System.out.println("3 == " + result);
		
		int[] prices_2 = {6,1,3,2,4,7};
		System.out.println("7 == " + so.maxProfit(prices_2));		
	}

	public int maxProfit(int[] prices) {
		
		int minPos = 0;
		int profit = 0;
		int sum = 0;
		for(int i=0,len = prices.length; i<len; i++) {
			if(prices[i]<prices[minPos]){
				minPos = i;
			}
			int tmpProfit = prices[i] - prices[minPos];	
			if(tmpProfit> profit){
				profit = tmpProfit;
				if(len-1 == i){
					sum += profit;
				}
			}else{
				minPos = i;
				sum += profit;
				profit = 0;	
			}			
		}
		return sum;
	}
// 
	public int littleQuickerSolution(int[] prices){
		int profit = 0;
		for(int i=1; i<prices.length; i++){
			int diff = prices[i] - prices[i-1];
			if(diff>0){
				profit += diff;
			}
		}
		return profit;
	}

}
