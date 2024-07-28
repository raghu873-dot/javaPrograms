package com.net.Leetcode;

public class PlusOne {

	public static void main(String[] args) {

		int [] digits = {9,8,9};
//				Output: [1,2,4]
//				Explanation: The array represents the integer 123.
//				Incrementing by one gives 123 + 1 = 124.
//				Thus, the result should be [1,2,4].
//
//				Input: digits = [4,3,2,1]
//				Output: [4,3,2,2]
//				Explanation: The array represents the integer 4321.
//				Incrementing by one gives 4321 + 1 = 4322.
//				Thus, the result should be [4,3,2,2].
//
//				Input: digits = [9]
//				Output: [1,0]
//				Explanation: The array represents the integer 9.
//				Incrementing by one gives 9 + 1 = 10.
//				Thus, the result should be [1,0].
				
		digits=digits(digits);
		
		for(int i=0;i<digits.length;i++) {
			System.out.println(digits[i]);
		}
	}

	private static int[] digits(int[] digits) {
		
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
		
		
		
		
	}

}
