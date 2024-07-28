package com.net.programs;

public class ReverseWords {

	public static void main(String[] args) {

		String s="my name is raghu";
		
		String [] words=s.split(" ");
		String wordsRev="";
		
		for(int i=words.length-1;i>=0;i--) {
			String rev="";
			String str=words[i];
			for(int j=str.length()-1;j>=0;j--) {
				rev=rev+str.charAt(j);
			}
			wordsRev=wordsRev+" "+rev;
		}
		System.out.println(wordsRev);
	}

}
