package com.net.Triple;

import java.util.Scanner;

public class FirstAndLetterSwap {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String[] words=s.split(" ");
		String word=null;
		for(int i=0;i<words.length;i++) {
		
			 word=words[i];
			char str[]=word.toCharArray();
			for(int j=0;j<str.length;j++) {
			char first=str[0];
			str[0]=str[word.length()-1];	
			str[word.length()-1]=first;	
			}
		}
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
	}

}
