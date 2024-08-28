package com.net.Important;

public class MaximumSubarray {

	public static void main(String[] args) {

		//leetcode - 53
		
		int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
		//Output: 6
		//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
		
//		Input: nums = [5,4,-1,7,8]
//				Output: 23
//				Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
		
		int sum=0;
		int maxsum=nums[0];
		
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i];
			
			if(sum>maxsum) {
				maxsum=sum;
			}
			
			//if sum is negative make it zero
			if(sum<0) {
				sum=0;
			}
		}
		
		System.out.println(maxsum);
	}

}
