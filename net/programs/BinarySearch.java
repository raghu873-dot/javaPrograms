package com.net.programs;

public class BinarySearch {

	public static void main(String[] args) {

		int [] array= {10,20,30,40,50,60};
		int n=50;
		
		int lowerIndex=0;
		int highestIndex=array.length;
		int middelIndex=(lowerIndex+highestIndex)/2;
		
		while(lowerIndex<=highestIndex) {
			
			if(array[middelIndex]==n) {
				break;
			}else if(array[middelIndex]>n) {
				highestIndex=middelIndex+1;
			}else {
				lowerIndex=middelIndex-1;
			}
			
			middelIndex=(lowerIndex+highestIndex)/2;
		}
		System.out.println(middelIndex);
	}

}
