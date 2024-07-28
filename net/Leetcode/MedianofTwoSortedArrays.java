package com.net.Leetcode;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		
		int [] nums1 = {1,2}, nums2 = {3,4};
//				Output: 2.00000
//				Explanation: merged array = [1,2,3] and median is 2.

//				Input: nums1 = [1,2], nums2 = [3,4]
//				Output: 2.50000
//				Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
		
		int length=nums1.length+nums2.length;
		int [] nums=new int[length];
		
		for(int i=0;i<nums1.length;i++) {
			nums[i]=nums1[i];
		}
		for(int i=0;i<nums2.length;i++) {
			nums[i+nums1.length]=nums2[i];
		}
		
		Arrays.sort(nums);
		double sum=0;
		if(nums.length%2==0) {
			int n=nums.length/2;
			int n1=n-1;
			sum=((double)(nums[n]+nums[n1])/2);
			System.out.println(sum);
		}else {
			int n=nums.length/2;
			sum=nums[n];
			System.out.println(sum);
		}
	}
}
