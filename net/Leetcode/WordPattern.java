package com.net.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		
		String pattern = "abba", s = "dog cat cat dog";
//				Output: true
//
//				Input: pattern = "abba", s = "dog cat cat fish"
//				Output: false
//
//				Input: pattern = "aaaa", s = "dog cat cat dog"
//				Output: false
		
		
		Map<Character,String> map=new HashMap<Character,String>();
        String [] words=s.split(" ");
        
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
            	if(!map.get(pattern.charAt(i)).equals(words[i]))
                System.out.println(false);
                break;
            }else if(map.containsValue(words[i])){
            	System.out.println(false);
            	break;
            }
            else{
                map.put(pattern.charAt(i), words[i]);
            }
        }

        System.out.println(true);

	}

}
