package com.net.Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacterinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "leetcode";
//				Output: 0
//
//				Input: s = "loveleetcode"
//				Output: 2
//
//				Input: s = "aabb"
//				Output: -1
		
		
		int [] freq=new int [26];
		
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)-97]++;
		}
		
		for(int i=0;i<s.length();i++) {
			if(freq[s.charAt(i)-97]==1) {
				System.out.println(i);
			}
		}
		
		System.out.println("-1");
		
//		Map<Character,Integer> map=new HashMap<Character,Integer>();
//
//        char[] ch=s.toCharArray();
//        for(Character c:ch){
//            if(map.containsKey(c)){
//                map.put(c,map.get(c)+1);
//            }else{
//                map.put(c,1);
//            }
//        }
//        
//        for(Character c:ch){
//            if(map.get(c)==1){
//               System.out.println(s.indexOf(c));
//               break;
//            }
//        } 
//
//            System.out.println("-1");
	}

}
