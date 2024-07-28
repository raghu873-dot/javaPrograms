package com.net.Leetcode;

public class IsSubsequence {

	public static void main(String[] args) {
		
		String s = "abc", t = "ahcgdb";
		//Output: true

//				Input: s = "axc", t = "ahbgdc"
//				Output: false

//		int index=0;
//		int count=0;
//		char [] ch=s.toCharArray();
//		char [] ch1=t.toCharArray();
//		
//		for(int i=0;i<s.length();i++) {
//			for(int j=index;j<t.length();j++) {
//				if(ch[i]==ch1[j]) {
//					index=j+1;
//					count++;
//				}
//			}
//		}
//		
//		if(count==s.length()) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
		
		int i=0;
		int j=0;
		
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
				j++;
			}else {
				j++;
			}
		}
		
		if(i==s.length()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
