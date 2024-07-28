package com.net.programs;

public class primeOrNot {

	public static void main(String[] args) {

		int count=0;
		int n=7;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
