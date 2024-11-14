package com.net.Triple;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 1, 2, 3};
        int target = 4;
        
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++) {
        	int complement=target-nums[i];
        	if(map.containsKey(complement)) {
        		System.out.println(map.get(complement)+","+i);
        	}
        	map.put(nums[i], i);
        }
	}

	

	
}
		
		
