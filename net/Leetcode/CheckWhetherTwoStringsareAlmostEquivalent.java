package com.net.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class CheckWhetherTwoStringsareAlmostEquivalent {

	public static void main(String[] args) {
		
		//leetcode = 2068
		
		String word1 = "bbbb", word2 = "bbbb";
//				Output: true
//				Explanation: The differences between the frequencies of each letter in word1 and word2 are at most 3:
//				- 'a' appears 1 time in word1 and 4 times in word2. The difference is 3.
//				- 'b' appears 1 time in word1 and 1 time in word2. The difference is 0.
//				- 'c' appears 1 time in word1 and 2 times in word2. The difference is 1.
//				- 'd' appears 1 time in word1 and 0 times in word2. The difference is 1.
//				- 'e' appears 2 times in word1 and 0 times in word2. The difference is 2.
//				- 'f' appears 1 time in word1 and 0 times in word2. The difference is 1.
		
		
		
		int [] freq=new int[26];
		
		for(int i=0;i<word1.length();i++) {
			
			freq[word1.charAt(i)-97]++;
			freq[word2.charAt(i)-97]--;
		}
		
		for(int i=0;i<26;i++) {
			if(Math.abs(freq[i])>3) {
				System.out.println(false);
			}
		}
		System.out.println(true);
		
//		Map<Character,Integer> mapWord1=new HashMap<>();
//		Map<Character,Integer> mapWord2=new HashMap<>();
//		
//		for(Character c:word1.toCharArray()) {
//			if(mapWord1.containsKey(c)) {
//				mapWord1.put(c, mapWord1.get(c)+1);
//			}else {
//				mapWord1.put(c, 1);
//			}
//		}
//		
//		for(Character c:word2.toCharArray()) {
//			if(mapWord2.containsKey(c)) {
//				mapWord2.put(c, mapWord2.get(c)+1);
//			}else {
//				mapWord2.put(c, 1);
//			}
//		}
//		
//		for(int i=0;i<word1.length();i++) {
//			if(Math.abs(mapWord1.containsKey(word1.charAt(i))?mapWord1.get(word1.charAt(i)):0 - mapWord2.get(mapWord2.containsKey(word1.charAt(i))?word1.charAt(i):0)) >3) {
//				System.out.println("false");
//			}
//		}
//
//		System.out.println("true");
		
	}

}
