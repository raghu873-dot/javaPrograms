package com.net.Important;

import java.util.Arrays;

public class FirstMissingPositiveNumber {

	public static void main(String[] args) {
		int arr[] = {0,1, 2, 4, 6, 3, 7, 8};
		
		int missingFirstPos=0;
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			if(missingFirstPos==arr[i]) {
				missingFirstPos++;
			}
		}
		
		System.out.println(missingFirstPos);
	}

}
