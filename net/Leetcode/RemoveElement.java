package com.net.Leetcode;

public class RemoveElement {
	
	public static void main(String[] args) {
		  int [] nums1 = {0,1,2,2,3,0,4,2};
	      int val=2;
	      
	      //output = {0,1,3,0,4,'_','_','_'};
	      
	      removeElem(nums1,val);
	      
	      for(int i=0;i<nums1.length;i++) {
	    	  System.out.println(nums1[i]);
	      }
	}

	private static void removeElem(int[] nums1, int val) {
		
		 int index=0;
		 
		 for(int i=0;i<nums1.length;i++) {
			 
			 if(nums1[i]!=val) {
				nums1[index]=nums1[i];
				index++;
			 }
		 }
		System.out.println(index);
	}

}
