package com.net.Leetcode;

public class ValidAnagram {

	public static void main(String[] args) {
        
		//leetcode = 242
		
		
		String s = "anagram", t = "nagaram";
		//Output: true

//				Input: s = "rat", t = "car"
//				Output: false
		
		int [] freq1=new int[26];
        int [] freq2=new int[26];

        if(s.length()!=t.length())
        System.out.println(false);
		
		for(int i=0;i<s.length();i++) {
			
			freq1[s.charAt(i)-'a']++;
			freq1[t.charAt(i)-'a']--;
		}
		
		for(int i=0;i<26;i++) {
			if(freq1[i]!=0) {
				System.out.println(false);
			}
		}
		
		System.out.println(true);
	}

}
