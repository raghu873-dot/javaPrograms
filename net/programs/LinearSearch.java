package com.net.programs;

public class LinearSearch {
	public static void main(String[] args) {
		
		int [] array= {70,40,50,20,45};
		int n=50;
		int index=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==n) {
				index=i;
				break;
			}
			
		}
		System.out.println(index);
		
	}
}
