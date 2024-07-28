package com.net.Triple;

import java.util.Scanner;

public class WordsCount {

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter the words");
	    	String str=sc.nextLine();
//	    	int count=1;
//	    	for(int i=0;i<str.length()-1;i++) {
//	    		if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
//	    			count++;
//	    		}
//	    	}
//	    	System.out.println("no of words in a String : " + count);
	    	
	    	String[] words=str.split("\\s+");
	    	System.out.println(words.length);
	    }
	}


