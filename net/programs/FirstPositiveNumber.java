package com.net.programs;

import java.util.Arrays;

public class FirstPositiveNumber {

	public static void main(String[] args) {
        int [] nums= {3,4,-1,1};
       // nums= {1,2,0};
        Arrays.sort(nums);
        int smallestPositive=1;
        
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==smallestPositive) {
        		smallestPositive++;
        	}
        }
        System.out.println(smallestPositive);
	}

}
