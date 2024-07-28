package com.net.Leetcode;

public class RotateArray {

	public static void main(String[] args) {

	 int [] nums = {1,2,3,4,5,6,7};  
	 int k = 3;
	 //Output: [5,6,7,1,2,3,4];
	 
	// Ensure k is within array bounds
	 k=nums.length%k;
	 int n=nums.length;
	 reverse(nums,0,n-1);
	 //Output: [7,6,5,4,3,2,1];
	 reverse(nums,0,k-1);
	//Output: [5,6,7,4,3,2,1];
	 reverse(nums,k,n-1);
	//Output: [5,6,7,1,2,3,4];
	 
	 for(int i=0;i<nums.length;i++) {
		 System.out.println(nums[i]);
	 }
	}

	private static void reverse(int[] nums, int start, int end) {
		
		while(start<end) {
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		
	}

}
