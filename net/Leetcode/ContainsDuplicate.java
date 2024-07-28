package com.net.Leetcode;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		//leetcode = 217

		int [] nums = {1,2,3,1};
				//Output: true

//				Input: nums = [1,2,3,4]
//				Output: false
//
//				Input: nums = [1,1,1,3,3,4,3,2,4,2]
//				Output: true
		
		Arrays.sort(nums);

	       for(int i=1;i<nums.length;i++){
	           if(nums[i]==nums[i-1])
	             System.out.println(true);
	       }

	       System.out.println(false);
	    }

}
