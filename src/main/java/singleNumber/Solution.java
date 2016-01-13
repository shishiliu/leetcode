package singleNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int singleNumber(int[] nums) {
    	int finding = 0;
        Map<Integer, Integer> num_map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
        	Integer key = new Integer(hashCode(nums[i]));
        	if(num_map.containsKey(key)){
        		num_map.remove(key);
        	}else {
        		num_map.put(new Integer(hashCode(nums[i])), nums[i]);
        	}
        }
        if(num_map.size()==1) {
        	Set<Integer> keys = num_map.keySet();
        	for(Integer k : keys) {
        		finding = num_map.get(k);
        	}
        }
        return finding;
    }
    
    public int hashCode (int n) {
        int code = n*13+97;
        return code;
    }
    
    public static void main(String[] args) {
    	Solution so = new Solution();
    	
    	int[] nums = {2,2,3,1,3,4,4};
		System.out.println("finding:" + so.singleNumber(nums ));
    }
}
