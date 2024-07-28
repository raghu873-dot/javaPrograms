package com.net.Triple;

public class ArrayPro {

	public static void main(String[] args) {
		
		int prices[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		int max=0;
		int result=0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]>=max) {
				max=prices[i];
			}else {
				result=result+max-prices[i];
			}
		}
		System.out.println(result);
	}
}
