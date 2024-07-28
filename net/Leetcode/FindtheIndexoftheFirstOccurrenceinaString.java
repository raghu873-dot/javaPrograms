package com.net.Leetcode;

public class FindtheIndexoftheFirstOccurrenceinaString {

	public static void main(String[] args) {
		
		//leetcode - 28

		String haystack = "a", needle = "a";
				//Output: 0
		       //String haystack = "sadbutsad", needle = "sad";
//				Explanation: "sad" occurs at index 0 and 6.
//				The first occurrence is at index 0, so we return 0.

//				Input: haystack = "leetcode", needle = "leeto"
//				Output: -1
//				Explanation: "leeto" did not occur in "leetcode", so we return -1.
		
		for(int i=0;i<haystack.length();i++) {
			if(haystack.length()-needle.length() >=i) {
				String substring=haystack.substring(i, i+needle.length());
				if(needle.equals(substring)) {
					System.out.println(i);
				}
			}
		}
		
		System.out.println(-1);
	}

}
