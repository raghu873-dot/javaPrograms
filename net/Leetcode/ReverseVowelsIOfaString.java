package com.net.Leetcode;

public class ReverseVowelsIOfaString {

	public static void main(String[] args) {
		
		//leetcode = 345
		
		String s = "hello";
//				Output: "holle"
//
//				Input: s = "leetcode"
//				Output: "leotcede"
		
		char [] ch=s.toCharArray();
		
		int start=0;
		int end=ch.length-1;
		
		while(start<end) {
			while (start < end && !isVowel(ch[start])) {
                start++;
            }

            while (start < end && !isVowel(ch[end])) {
                end--;
            }
            
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			
			
		}
		
		System.out.println(String.valueOf(ch));

	}
	
	private static boolean isVowel(char c) {
		return c=='a' || c=='e' || c=='o' || c=='u' || c=='i' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
	}

}
