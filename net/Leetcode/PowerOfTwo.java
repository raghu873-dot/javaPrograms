package com.net.Leetcode;

public class PowerOfTwo {

	public static void main(String[] args) {
		//leetcode = 258
		
//		Example 1:
//
//			Input: n = 1
//			Output: true
//			Explanation: 20 = 1
//			Example 2:
//
//			Input: n = 16
//			Output: true
//			Explanation: 24 = 16
		
	    int n=16;
	    int result=n;
	    int i=0;
	    int count=0;
	    
	    if(n==1){
            System.out.println("true");
        }
	    
		while(i<n) {
			n=n/2;
			count++;
		}
		
		double d=Math.pow(2, count-1);
		
		if(Double.valueOf(result)==d) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
