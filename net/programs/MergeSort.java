package com.net.programs;

public class MergeSort {

	public static void main(String[] args) {
		int [] arr= {6,3,9,5,2,8};
		int n=arr.length;
		divideArray(arr,0,n-1);
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void divideArray(int [] arr,int lowerIndex,int higherIndex) {
		
		if(lowerIndex>=higherIndex) {
			return;
		}
		int middleIndex=lowerIndex+(higherIndex-lowerIndex)/2;
		
		divideArray(arr, lowerIndex, middleIndex);
		
		divideArray(arr, middleIndex+1, higherIndex);
		
		mergeArray(arr,lowerIndex,middleIndex,higherIndex);
		
	}
	
	public static void mergeArray(int [] arr,int lowerIndex,int middleIndex,int higherIndex) {
		
		int [] mergedArray=new int[higherIndex-lowerIndex+1];
		
		int index1=lowerIndex;
		int index2=middleIndex+1;
		int k=0;
		
		while(index1<=middleIndex && index2<=higherIndex) {
			if(arr[index1]<=arr[index2]) {
				mergedArray[k]=arr[index1];
				index1++;
			}else{
				mergedArray[k]=arr[index2];
				index2++;
			}
			k++;
		}
		
		while(index1<=middleIndex) {
			mergedArray[k]=arr[index1];
			index1++;
			k++;
		}
		
		while(index2<=higherIndex) {
			mergedArray[k]=arr[index2];
			index2++;
			k++;
		}
		
		for(int i=0, j=lowerIndex;i<mergedArray.length;i++,j++) {
			arr[j]=mergedArray[i];
		}
	}
	
	
	}
	
