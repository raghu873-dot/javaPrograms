package com.net.Leetcode;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		
		String s = "a-bC-dEf-ghIj";
		//Output: "j-Ih-gfE-dCba"

//				Input: s = "Test1ng-Leet=code-Q!"
//				Output: "Qedo1ct-eeLg=ntse-T!"
				
		char [] ch=s.toCharArray();	
		
		int start=0;
		int end=s.length()-1;
		
		while(start<end) {
			if(!Character.isLetter(ch[start])) {
				start++;
			}else if(!Character.isLetter(ch[end])) {
				end--;
			}else {
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
		}
		
		System.out.println(new String(ch));
		
		//Character.isDigit(ch[i]);
		//Character.isWhitespace(ch[i]);
//		Character.isLetterOrDigit(ch)
//		Character.isLowerCase(ch)
//		Character.isUpperCase(ch)
		
		
	}

}
