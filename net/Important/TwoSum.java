package com.net.Important;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 1, 2, 3};
        int target = 4;
        
       //leetcode = 1
        
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
        	int complement=target-nums[i];
        	if(map.containsKey(complement)) {
        		System.out.println(map.get(complement)+","+i);
        	//	to get first indices apply break 
        		break;
        	}
        	map.put(nums[i], i);
        }
	}

}
