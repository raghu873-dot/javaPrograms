package com.net.Important;

public class SecondLargestNumberInArray {
	public static void main(String[] args) {

	int [] arr={10,70,80,30,70,60,80};
	
	int largestNum=Integer.MIN_VALUE;
	int secondLargestNum=Integer.MIN_VALUE;
	
	for(int i=0;i<arr.length;i++) {
		
	   if(arr[i]>largestNum) {
		   secondLargestNum=largestNum;
		   largestNum=arr[i];
	   }else if(arr[i]>secondLargestNum && arr[i]!=largestNum) {
		   secondLargestNum=arr[i];
	   }
	}
	
	System.out.println(secondLargestNum);
  }
}
