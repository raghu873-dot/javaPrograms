package com.net.Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindLuckyIntegerinanArray {

	public static void main(String[] args) {

		//leetcode - 1394
		
		int [] arr = {1,2,2,3,3,3};
				//Output: 3
				//Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
		
		int maxNum=-1;
	    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(Integer i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		
		Set<Entry<Integer, Integer>> result=map.entrySet();
		for(Entry<Integer, Integer> set:result) {
			if(set.getKey()==set.getValue() && set.getValue()>maxNum) {
				maxNum=set.getValue();
			}
		}
		
		System.out.println(maxNum);
		
	}

}
