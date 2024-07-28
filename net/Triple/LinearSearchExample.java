package com.net.Triple;

import java.util.Arrays;
import java.util.List;

public class LinearSearchExample{    
    public static void main(String a[]){    
    	int[] places = {-10000,1000};  
//        int key = 0;    
//        for(int i=1;;){    
//            if(!places.contains(i)){    
//                key=i;
//               break;
//            }    
//        }    
//        System.out.println(key);
    	int count=0;
    	int key=0;
    	for(int i=1;i<1000;i++) {
    		count=0;
    		for(int j=0;j<places.length;j++) {
    			
    			if(places[j]>0 && places[j]==i) {
    				count=1;
    			}
    		}
    		if(count==0) {
				key=i;
				break;
			}
    	}
    	
    	System.out.println(key);
    }    
}    
