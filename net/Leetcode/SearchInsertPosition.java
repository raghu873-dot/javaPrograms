package com.net.Leetcode;

public class SearchInsertPosition {

	public static void main(String[] args) {

		//leetcode - 35
		
			int[] nums = {1,3,5,6};
	        int target = 5;
			//Output: 2
			
		//Example 2:

//			Input: nums = [1,3,5,6], target = 2
//			Output: 1
	        
	        for(int i=0;i<nums.length;i++) {
	        	
	        	if(nums[i]==target) {
	        		System.out.println(i);
	        	}else if(target<nums[i]){
	        		System.out.println(i-1);
	        	}
	        }
	        System.out.println(nums.length+1);
	}

}
