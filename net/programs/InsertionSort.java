package com.net.programs;

public class InsertionSort {

	public static void main(String[] args) {
		int [] arr= {6,3,9,5,2,8};
		
		
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			
			while(j>0 && arr[j-1]>arr[j]) {
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
