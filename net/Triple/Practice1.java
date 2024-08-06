package com.net.Triple;

public class Practice1 {

		public static void main(String[] args) {
			int [] array= {3,2,4,6,5,7,8,9,10,11,13,12};
			
			for(int i=0;i<array.length;i++) {
				
				for(int j=i+1;j<array.length;j++) {
					if(array[i]>array[j]) {
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
			
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}
			
		}
	}
