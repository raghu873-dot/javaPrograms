package com.net.programs;

public class StringPalindrome {

	public static void main(String[] args) {

		String palindrome="strts";
		String rev="";
		
		for(int i=palindrome.length()-1;i>=0;i--) {
			rev=rev+palindrome.charAt(i);
		}
		
	if(palindrome.equals(rev)) {
		System.out.println("palindrome");
	}else {
		System.out.println("not a palindrome");
	}
	}

}
