package com.net.programs;

public class Palindrome {

	public static void main(String[] args) {

		int n=121;
		int temp=n;
		int rev=0,rem;
		
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		if(rev==n) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

}
