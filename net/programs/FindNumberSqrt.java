package com.net.programs;

public class FindNumberSqrt {

	public static void main(String[] args) {

		int x=121;
		
		double sqrt=Math.sqrt(x);
		
		if(sqrt==(int)sqrt) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
