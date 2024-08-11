package com.net.Triple;

public class Practice1 {

		public static void main(String[] args) {
			 int[] nums = {1, 2, 3, 4, 5, 6, 7};
		     int k = 8;
		     
		     k=k%nums.length;
		     reverse(nums,0,nums.length-1);
		     reverse(nums,0,k-1);
		     reverse(nums,k,nums.length-1);
		     
		     for(int i=0;i<nums.length;i++) {
		    	 System.out.println(nums[i]);
		     }
		}
		
		private static void reverse(int [] nums,int start,int end) {
			while(start<=end) {
				int temp=nums[start];
				nums[start]=nums[end];
				nums[end]=temp;
				start++;
				end--;
			}
		}
		
	}
