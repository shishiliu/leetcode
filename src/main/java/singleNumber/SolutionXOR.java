package singleNumber;

public class SolutionXOR {
    public int singleNumber(int[] nums) {
    	int finding = nums[0];
    	for(int i=1, len=nums.length; i<len; i++) {
    		finding = finding ^ nums[i];
    	}
        return finding;
    }
    
    public static void main(String[] args) {
    	Solution so = new Solution();
    	
    	int[] nums = {2,2,3,1,3,4,4};
		System.out.println("finding:" + so.singleNumber(nums ));
    }
}
