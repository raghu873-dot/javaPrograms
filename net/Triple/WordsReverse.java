package com.net.Triple;

import java.util.Scanner;

public class WordsReverse { 
	
	 public static void main(String[] args) {
		 
		 String s="pitcure perfect less boin nbnnn";
			
			String[] words=s.split("\\s+");
			
			int left=0;
			int right=words.length-1;
			
			while(left<right) {
				String word=words[left];
				words[left]=words[right];
				words[right]=word;
				left++;
				right--;
				
			}
			
			System.out.println(String.join(" ", words));

}
}