package com.net.Leetcode;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	
	public static void main(String[] args) {
		  int [] nums1 = {1,2,3,0,0,0};
	      int m = 3; 
	      int [] nums2 = {2,5,6};
	      int  n = 3;
	      
	      merge(nums1,m,nums2,n);
	      
	      for(int i=0;i<m+n;i++) {
	    	  System.out.println(nums1[i]);
	      }
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {

		if(nums1.length==1 && nums2.length==1){
            nums1[m]=nums2[0];
        }else{
        for(int i=m,j=0;i<m+n;i++,j++) {
			nums1[i]=nums2[j];
		}
		Arrays.sort(nums1);
	}
	}
}
