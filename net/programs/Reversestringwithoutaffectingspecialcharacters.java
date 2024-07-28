package com.net.programs;

public class Reversestringwithoutaffectingspecialcharacters {

	public static void main(String[] args) {
       String str="a,b$c43";
       
       char[] ch=str.toCharArray();
       
       int left=0;
       int right=ch.length-1;
       
       while(left<right) {
    	  if(!Character.isLetterOrDigit(ch[left])) {
    		 left++; 
    	  }else if(Character.isLetterOrDigit(ch[right])) {
    		  right--;
    	  }else {
    		  char temp=ch[left];
    		  ch[left]=ch[right];
    		  ch[right]=temp;
    	  }
       }
       
       System.out.println(String.valueOf(ch));
	}

}
