package com.net.Important;

public class ConsecutiveOccurenceMoreThanTwo {

	public static void main(String[] args) {
		int [] nums= {7,8,1,1,1,1,4,5,2,2,2,5,6,8,8,8,9,0};
		
		int current=nums[0];
		int count=1;
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==current) {
				count++;
			}else {
				if(count>2) {
					System.out.println(current+" "+count);
				}
				current=nums[i];
				count=1;
			}
		}
		
		if(count>2) {
			System.out.println(current+" "+count);
		}
	}

}
