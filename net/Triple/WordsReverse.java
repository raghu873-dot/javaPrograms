package com.net.Triple;

import java.util.Scanner;

public class WordsReverse { 
	
	 public static void main(String[] args) {
		 
//	    	Scanner sc=new Scanner(System.in);
//	    	System.out.println("enter the word");
//	    	String str=sc.nextLine();
//	    	String revWord="";,
//	    	
//	    	String words[]=str.split(" ");
//
//	    	for(int i=0;i<words.length;i++) {
//	    		String word=words[i];
//	    		//word.toCharArray();
//	    		String revchar="";
//	    		String temp1="";
//	    		String temp2="";
//	    		for(int j=0;j<=word.length();j++) {
//	    			
//	    			if(word.substring(word.length() - 1) != null && j==1) {
//	    			      temp1=temp1+word.charAt(j);
//	    		}
//	    	}
//	    		
//	    		for(int k=0;k<=temp1.length();i++) {
//	    			if(k==0) {
//	    				word.replace(word.charAt(1), temp1.charAt(k));
//	    			}
//	    			else {
//	    				int v=word.substring(word.length()-1);
//	    				word.replace(word.substring(word.charAt(v), temp1.charAt(k));
//	    			}
//	    			
//	    		}
////            for(String s:words) {
////            	StringBuilder sb=new StringBuilder(s);
////	    	sb.reverse();
////	    	revWord=revWord+sb+ " ";
////            }
//           
//	    }
		 
		 
		 String sent= "java is programming language";
		 // output = jvaa is pnorgammirg lgnguaae;
		 char[] charArray = sent.toCharArray();
		 int k=0;
		 for(int i=0; i <charArray.length-1 ; i++) {
			 
			 while(charArray[i+1]!=' ')
				 i++;
			 char temp = charArray[i-1];
			 charArray[i-1] =charArray[k+1];
			 charArray[k+1]= temp;
			 k=i+1; 
			 
			 
		 }
		 System.out.println(charArray);

}
}