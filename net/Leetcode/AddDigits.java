package com.net.Leetcode;

public class AddDigits {

	public static void main(String[] args) {

		//leetcode = 258
		
//		Input: num = 38
//				Output: 2
//				Explanation: The process is
//				38 --> 3 + 8 --> 11
//				11 --> 1 + 1 --> 2 
//				Since 2 has only one digit, return it.
		
		int num=38;
		int sum=num;
		int i=0;
		while(num>9) {
			sum=0;
			while(i<num) {
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			num=sum;
		}
		
		
		System.out.println(sum);
	}

}
