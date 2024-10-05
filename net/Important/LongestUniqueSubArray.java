package com.net.Important;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubArray {

	public static void main(String[] args) {

        int[] input = {1, 1, 2, 3, 4, 5, 3, 4, 8, 8, 1, 2, 3, 4, 5};

        int[] result = longestUniqueSubarray(input);
        System.out.println("Longest unique subarray: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    
	}

	private static int[] longestUniqueSubarray(int[] nums) {
		
		Set<Integer> set=new HashSet<>();
		int maxLength=0;
		int start=0;
		int maxStart=0;
		
		for(int end=0;end<nums.length;end++) {
			int currentNum=nums[end];
			
			if(set.contains(currentNum)) {
				set.clear();
				start=end;
			}
			
			set.add(currentNum);
			
			if(end-start+1>maxLength) {
				maxLength=end-start+1;
				maxStart=start;
			}
			
		}
		int[] longestSub=new int[maxLength];
		for(int i=0;i<maxLength;i++) {
			longestSub[i]=nums[maxStart+i];
		}
		return longestSub;
	}

}
