package com.net.Leetcode;

public class CountTheNumberOfVowelStringsInRange {

	public static void main(String[] args) {
		String [] words = {"are","amy","u"}; int left = 0; int right = 2;
		//Output: 2
		
//		Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
//				Output: 3
		
//		Input: words = ["n","a","o"], left = 0, right = 2
//       Output: 2
		
		
		
		int count=0;
		for(int i=left;i<=right;i++) {
			char ch[]=words[i].toCharArray();
			
			if(ch.length==1 && (ch[0]=='a' || ch[0]=='e' || ch[0]=='i' || ch[0]=='o' || ch[0]=='u')) {
				count++;
			}else if((ch[0]=='a' || ch[0]=='e' || ch[0]=='i' || ch[0]=='o' || ch[0]=='u') && (ch[ch.length-1]=='a' || ch[ch.length-1]=='e' || ch[ch.length-1]=='i' || ch[ch.length-1]=='o' || ch[ch.length-1]=='u')){
				count++;
			}
		}
		
		System.out.println(count);
	}
}
