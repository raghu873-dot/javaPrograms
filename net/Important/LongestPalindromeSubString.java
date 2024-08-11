package com.net.Important;

public class LongestPalindromeSubString {

	public static void main(String[] args) {
		
		String s="babad";
		
		char [] ch=s.toCharArray();
		String largestPali="";
		String swapSubString="";
		for(int i=0;i<s.length();i++) {
			int j=s.length()-1;
			while(i<j) {
				if(ch[i]==ch[j]) {
					String subString=s.substring(i,j+1);
					 swapSubString=swap(subString);
					if(subString.equals(swapSubString)) {
						break;
					}
				}
				j--;
			}
			if(swapSubString.length()>largestPali.length()) {
				largestPali=swapSubString;
			}
			
		}
		System.out.println(largestPali);
	}
	
	private static String swap(String swapSubString) {
		int left=0;
		int right=swapSubString.length()-1;
		char [] ch=swapSubString.toCharArray();
		while(left<right) {
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=ch[left];
			left++;
			right--;
		}
		return String.valueOf(ch);
	}
}
