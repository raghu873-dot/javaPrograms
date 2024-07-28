package com.net.Leetcode;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		int arr[]= {7,1,5,3,6,4};
		
        stock(arr);
	}

	private static void stock(int[] arr) {
		
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum=0;
				if(arr[i]<arr[j]) {
					sum=arr[j]-arr[i]; 
				}
				if(max<sum) {
					max=sum;
				}
			}
		}
		System.out.println(max);
	}

}
