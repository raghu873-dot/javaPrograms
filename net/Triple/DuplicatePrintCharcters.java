package com.net.Triple;
import java.util.*;
import java.util.Map.Entry;

public class DuplicatePrintCharcters {

	public static void main(String[] args) {

		 String arr= "abcacadg";
		 char [] y=arr.toCharArray();
		 Map<Character,Integer> map=new HashMap<>();
		 for(Character ch:y) {
			 if(map.containsKey(ch)) {
				 map.put(ch,map.get(ch)+1);
			 }
			 else {
				 map.put(ch, 1);
			 }
			 
		 }
		 
		 Set<Map.Entry<Character, Integer>> result=map.entrySet();
		 for(Map.Entry<Character, Integer> result1:result) {
			 System.out.println(result1.getKey()+""+result1.getValue());
		 }
	}

}
