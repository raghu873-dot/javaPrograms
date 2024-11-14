package com.net.Important;

public class PrintCominationsOFString {

	public static void main(String[] args) {
       String s="ABC";
       
       printPerm(s,"");
	}

	private static void printPerm(String s, String perm) {
       	if(s.length()==0) {
       		System.out.println(perm);
       		return;
       	}
       	
       	for(int i=0;i<s.length();i++) {
       		char currentChar=s.charAt(i);
       		
       		String remainingChar=s.substring(0,i)+s.substring(i+1);
       		printPerm(remainingChar,perm+currentChar);
       	}
	}

}
