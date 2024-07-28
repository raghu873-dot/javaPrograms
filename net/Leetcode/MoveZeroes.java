package com.net.Leetcode;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {

		int [] nums = {0};
			//Output: [1,3,12,0,0]

//				Input: nums = [0]
//				Output: [0]
				
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
			if(nums[i]==0 && nums[i]<nums[j]) {
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
		 }
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}
