package com.net.Triple;

import java.util.Arrays;

public class StringRepeat {

	public static void main(String[] args) {
		int[] input= {1,5,3,6,2};
		
//		 int totalcount=0;
//		 int individualCount=1;
//		 int temp=input[0];
//		 for(int i=1;i<input.length;i++) {
//			 if(input[i]==temp && individualCount<2) {
//				 individualCount++;
//					 totalcount++;
//				 
//			 }else if(input[i]!=temp){
//				 temp=input[i];
//				 individualCount=1;
//			 }
//		 }
//	System.out.println(totalcount);
	Arrays.sort(input);
   for(int i=0;i<input.length;i++) {
	   System.out.print(input[i]);
   }
	}

}
