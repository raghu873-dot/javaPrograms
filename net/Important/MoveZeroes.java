package com.net.Important;

public class MoveZeroes {

	public static void main(String[] args) {

		int [] nums = {0,1,0,3,12};
			//Output: [1,3,12,0,0]

//				Input: nums = [0]
//				Output: [0]
		
		int index=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				int temp=nums[i];
				nums[i]=nums[index];
				nums[index]=temp;
				index++;
			}
		}
        
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}
