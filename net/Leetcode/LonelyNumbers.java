package com.net.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyNumbers {

	public static void main(String[] args) {
		
	// leetcode = 2150	
		int [] nums = {10,6,5,8};
	//Output: [10,8]
		
	 
	List<Integer> result=new ArrayList<Integer>();	
	
	Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	
	  for(Integer i:nums) {
		  if(map.containsKey(i)) {
			  map.put(i, map.get(i)+1);
		  }else {
			  map.put(i, 1);
		  }
	  }
	  
	  for(int i=0;i<nums.length;i++) {
		  if(map.get(nums[i])==1 && !map.containsKey(nums[i]+1) && !map.containsKey(nums[i]-1)) {
			  result.add(nums[i]);
			  System.out.println(nums[i]);
		  }
	  }
	
	}

}
