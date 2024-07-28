package com.net.Triple;

public class RunningSum {

	public static void main(String[] args) {
		int[] nums= {0,0,3,1,1,2,2,3,3,4};
		int arr=removeDuplicates(nums);
		System.out.println(arr);
	}
		
		public static int removeDuplicates(int[] nums) {
	        int count=0;
	        if(nums.length==0)
	            return 0;
	        for(int i=0;i<nums.length-1;i++)
	        {
	            if(nums[i+1]>nums[i])
	              count++;
	        
	            nums[count]=nums[i+1];
	        }
	        
	return count+1;
	    }
		    
	}


