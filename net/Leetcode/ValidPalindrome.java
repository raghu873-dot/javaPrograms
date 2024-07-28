package com.net.Leetcode;

public class ValidPalindrome {

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";
//				Output: true
//				Explanation: "amanaplanacanalpanama" is a palindrome.
//
//				Input: s = "race a car"
//				Output: false
//				Explanation: "raceacar" is not a palindrome.
//
//				Input: s = " "
//				Output: true
//				Explanation: s is an empty string "" after removing non-alphanumeric characters.
//				Since an empty string reads the same forward and backward, it is a palindrome.

		 String res=s.toLowerCase().replaceAll("[^a-z0-9]", "");
		 String rev="";
		 for(int i=res.length()-1;i>=0;i--)
		 {
			 rev=rev+res.charAt(i);
		 }
		 
		 if(res.equals(rev)) {
			 System.out.println(true);
		 }else {
			 System.out.println(false);
		 }
		 
	}

}
