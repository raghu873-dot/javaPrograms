package com.net.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {

		//leetcode = 205
		
		String s = "egg", t = "agg";
		//Output: true
		
		//String s = "badc", t = "baba";  false

//				Input: s = "foo", t = "bar"
//				Output: false
//
//				Input: s = "paper", t = "title"
//				Output: true
		
		Map<Character,Character> map=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(map.containsKey(s.charAt(i))) {
				if(map.get(s.charAt(i))!=t.charAt(i)) {
					System.out.println(false);
				}
				
			}else {
				if(map.containsValue(t.charAt(i)))
					System.out.println(false);
				
				map.put(s.charAt(i), t.charAt(i));
			}
		}
		System.out.println(true);
		 
	}

}
