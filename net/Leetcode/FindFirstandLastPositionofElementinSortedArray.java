package com.net.Leetcode;

public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		
		int[] input= {5,7,7,8,8,10}; 
		int target=8;
		int[] result= {-1,-1};
		
		int index=0;
		
		for(int i=0;i<input.length;i++) {
			if(input[i]==target) {
				if(index==0) {
					result[0]=i;
					result[1]=i;
					index++;
				}else {
					result[1]=i;
				}
			}
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
