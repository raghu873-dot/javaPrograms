package com.net.Important;

public class ReplaceTheSentence {

	public static void main(String[] args) {
    	String [] dictionary= {"cat","rat","bat"};
    	
    	String sentence="the cattle was rattled by the battery";
    	
//    	Input: dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
//    	Output: "a a b c"

    	
    	String [] words=sentence.split(" ");
    	String result="";
    	for(int i=0;i<words.length;i++) {
    		String word=words[i];
    		
    		for(String root:dictionary) {
    			if(word.startsWith(root)) {
    				word=root;
    				break;
    			}
    		}
    		
    		result=result+" "+word;
    	}
    	
    	System.out.println(result);
    }

}
