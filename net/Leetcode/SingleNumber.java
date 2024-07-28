package com.net.Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {
		
		int [] nums = {2,2,1};
//				Output: 1
//
//				Input: nums = [4,1,2,1,2]
//				Output: 4
//
//				Input: nums = [1]
//				Output: 1
		
		  Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		  
		  for(int n:nums) {
			 if(map.containsKey(n)) {
				 map.put(n, map.get(n)+1);			 
			}else {
				map.put(n, 1);
			}
		  }
		  
		  Set<Map.Entry<Integer,Integer>> set=map.entrySet();
		  
		  for(Map.Entry<Integer, Integer> result:set) {
			  if(result.getValue()==1) {
				  System.out.println(result.getKey());
			  }
		  }
        
	}

}
