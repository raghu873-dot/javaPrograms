package com.net.Leetcode;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="the sky is blue";
		
		String [] words=s.trim().split("\\s+");
        String rev="";

        for(int i=words.length-1;i>=0;i--){
            if(rev==""){
                rev=words[i];
            }else{
                rev=rev+" "+words[i];
            }
        }
        System.out.println(rev);

	}

}
