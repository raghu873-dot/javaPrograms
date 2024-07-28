package com.net.Leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		//leetcode = 14

		String[] strs = {"flower","flow","flight"};
				//Output: "fl"

//				Input: strs = ["dog","racecar","car"]
//				Output: ""
//				Explanation: There is no common prefix among the input strings.
		
		
		
		
		Arrays.sort(strs);
		String firstString=strs[0];
		String lastString=strs[strs.length-1];
		
		int index=0;
		
		while(index < firstString.length() && index<lastString.length()) {
			if(firstString.charAt(index) == lastString.charAt(index)) {
				index++;
			}else {
				break;
			}
		}
		
		System.out.println(firstString.substring(0, index));
		
//		String s=strs[0];
//		String result="";
//		
//		for(int i=0;i<s.length();i++) {
//			
//			for(int j=1;j<strs.length;j++) {
//				
//				if(i>strs[j].length() || s.charAt(i)!=strs[j].substring(i, i+1).charAt(0)) {
//					System.out.println(result);
//				}
//				
//			}
//			
//			if(result=="") {
//				result=String.valueOf(s.charAt(i));
//			}else {
//				result=result+String.valueOf(s.charAt(i));
//			}
//		}
//		
//		System.out.println(result);
	}

}
