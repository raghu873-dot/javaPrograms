package com.net.Leetcode;

import java.util.Arrays;
import java.util.List;

public class smallestCharFromString {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("abc","cab","lbr");
	//	output = aab;
		int n=3;
		String result="";
		for(String str:list) {
			char c=str.charAt(0);
			for(int i=1;i<str.length();i++) {
				if(str.charAt(i)<c) {
					c=str.charAt(i);
				}
			}
			result=result+String.valueOf(c);
		}
		System.out.println(result);
	}

}
