package com.net.Triple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Java18 {

	public static void main(String[] args) {
		
		int [] input= {2,9,6,1,4};
		int temp=0;
		int j=0;
		//selection sort
		for(int i=1;i<input.length;i++) {
			j=i;
			temp=input[i];
			while(j>0 && input[j-1]>temp) {
				input[j]=input[j-1];
				j=j-1;
			}
			input[j]=temp;
		}
		System.out.println(input);
	}
	

}
