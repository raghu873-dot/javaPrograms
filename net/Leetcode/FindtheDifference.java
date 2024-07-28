package com.net.Leetcode;

public class FindtheDifference {

	public static void main(String[] args) {
		
		//leetcode = 389
       
		String s = "abcd", t = "abcde";
		char ch;
//				Output: "e"
//				Explanation: 'e' is the letter that was added.

//				Input: s = "", t = "y"
//				Output: "y"
		
		int [] freq1=new int[26];
		int [] freq2=new int[26];
		
		for(int i=0;i<s.length();i++) {
			freq1[s.charAt(i)-'a']++;
		}
		for(int i=0;i<t.length();i++) {
			freq2[t.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++) {
			if(freq1[i]!=freq2[i]) {
				System.out.println((char)(i+97));
				ch='a';
			}
		}
		
	}

}
