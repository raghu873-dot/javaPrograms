package com.net.Important;

public class SortArray {

	public static void main(String[] args) {
		int [] arr= {10,30,50,60,40};
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				i=-1;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
