package com.net.Important;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		String s="dvdf";
		if(s!="") {
		String result="";
		String finalResult="";
		int index=0;
		for(int i=0;i<s.length();i++) {
			if(result.contains(String.valueOf(s.charAt(i)))) {
				i=index++;
				result=String.valueOf(s.charAt(i));
			}else {
				result=result+s.charAt(i);
			}
			if(finalResult.length()<result.length()) {
				finalResult=result;
			}
		}
		System.out.println(finalResult);
		}
		System.out.println("0");
	}

}
