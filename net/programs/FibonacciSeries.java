package com.net.programs;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n1=0,n2=1,n3;
		System.out.println(n1+" "+n2);
		int count=7;
		for(int i=2;i<count;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
		
	}

}
