package com.net.Leetcode;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		String s="pwwkew";
		String result=String.valueOf(s.charAt(0));
		String finalResult=result;
		for(int i=1;i<s.length();i++) {
			if(result.contains(String.valueOf(s.charAt(i)))) {
				result=String.valueOf(s.charAt(i));
			}else {
				result=result+s.charAt(i);
				finalResult=result;
			}
			if(finalResult.length()<result.length()) {
				finalResult=result;
			}
		}
		System.out.println(finalResult);
	}

}
