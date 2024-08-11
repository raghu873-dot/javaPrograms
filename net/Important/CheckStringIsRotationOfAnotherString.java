package com.net.Important;

public class CheckStringIsRotationOfAnotherString {

	public static void main(String[] args) {
		String s="ABCD";
		String t="DABC";
		
		String res=s+t;
		if(s.contains(res)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
