package com.net.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CountOccurenceHashMap {
	
	public static void main(String[] args) {
		
		String s="pitcure perfect";
		
		char ch[]=s.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(Character c:ch) {
			if(c!=' ') {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		  }
		}
		
		for(Map.Entry result:map.entrySet()) {
			System.out.println(result.getKey()+" "+ result.getValue());
		}
	}

}
