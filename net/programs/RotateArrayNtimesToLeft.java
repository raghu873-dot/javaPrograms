package com.net.programs;

public class RotateArrayNtimesToLeft {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5};   //output= {4,5,1,2,3}
		int n=3;
		for(int i=0;i<n;i++) {
			int first=array[0];
			int j;
			
			for(j=0;j<array.length-1;j++) {
				array[j]=array[j+1];
			}
			array[j]=first;
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
