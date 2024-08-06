package com.net.Leetcode;

public class LongestPalindromeSubString {

	public static void main(String[] args) {
       int [] arr= {10,20,40,50,80,80,70,70};
       
       int maxLength=Integer.MIN_VALUE;
       int secLength=Integer.MIN_VALUE;
       
        for(int i=0;i<arr.length-1;i++) {
        	if(arr[i] > arr[i+1]) {
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
