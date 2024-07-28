package com.net.programs;

public class ArmStrong {

	public static void main(String[] args) {
		int input=153;
		int temp=input;
		int digitLength=0,sum=0,last;
		
		while(temp!=0) {
			temp=temp/10;
			digitLength++;
		}
		temp=input;
		while(temp!=0) {
			last=temp%10;
			sum +=  (Math.pow(last, digitLength));
			temp=temp/10;
		}

		if(sum==input) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
	}

}
