package com.net.Important;

public class RotateArray {

	public static void main(String[] args) {

	 int [] nums = {1,2,3,4,5,6,7};  
	 int k = 3;
	 //Output: [5,6,7,1,2,3,4];
	 
	// Ensure k is within array length
	 
	  /* 1)  When k is smaller than the array length:
		 Suppose nums = [1, 2, 3, 4, 5] and k = 2.
		 The length of the array nums.length = 5.
		 k % nums.length results in 2 % 5 = 2.
		 So, k remains 2, and you rotate the array by 2 steps to the right.
		 
	  2)  When k is larger than the array length:
		 Suppose nums = [1, 2, 3, 4, 5] and k = 7.
		 The length of the array nums.length = 5.
		 k % nums.length results in 7 % 5 = 2.
		 So, instead of rotating the array by 7 steps, which would give the same result as rotating by 2 steps, the array is rotated by 2 steps.  */
	   
	 k=k%nums.length;
	 
	 int n=nums.length;
	 //reverse an entire array
	 reverse(nums,0,n-1);
	 //Output: [7,6,5,4,3,2,1];
	 
	// Reverse the first k elements
	 reverse(nums,0,k-1);
	//Output: [5,6,7,4,3,2,1];
	 
	// Reverse the rest of the array
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
