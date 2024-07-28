package com.net.Triple;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentHashMap {
	public static void main(String args[]) {
		
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3,3);
		
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			if(i.equals(2)) {
				map.put(4, 4);
			}
		}
	}
}
