package com.net.Leetcode;

public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence {

	public static void main(String[] args) {

	//	leetcode - 1455
		
		String sentence = "this problem is an easy problem";
		String searchWord = "pro";
		//Output: 4
	    //Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
		
		
		String [] words= sentence.split("\\s+");
		
		for(int i=0;i<words.length;i++) {
			String str=words[i];
			if(str.length()>=searchWord.length() && str.substring(0, searchWord.length()).contains(searchWord)) {
				System.out.println(i+1);
			}
		}
	}

}
