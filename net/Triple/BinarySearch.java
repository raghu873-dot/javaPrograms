package com.net.Triple;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {10,20,30,50,70,90};    
        int key = 50;   
       Arrays.sort(arr);
        int li=0;
        int hi=arr.length-1;
        int mi=(li+hi)/2;
        
        while(li<=hi) {
        	if(arr[mi]==key) {
        		System.out.println(mi);
        		break;
        	}else if(arr[mi]<key) {
        		li=mi+1;
        	}
        	else {
        		hi=mi-1;
        	}
        	mi=(li+hi)/2;
        }
	}

}
