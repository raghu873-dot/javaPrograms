package com.net.Important;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr= {6,3,9,5,2,8};
		int min=0;
		
		for(int i=0;i<arr.length;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
