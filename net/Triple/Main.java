package com.net.Triple;

import java.util.HashMap;

public class Main {
	  public static void main(String[] args) {
		  String[] array= {"a","a"};
		  String temp="";
		  char[] arr1 = null;
		  char[] arr2= null;
		  for(int i=0;i<array.length-1;i++) {
			  if(array[i]!="" || array[i+1]!="") {
				  
				  if(array[i].length()>array[i+1].length()) {
					  arr1=array[i].substring(0, array[i+1].length()).toCharArray();
					  arr2=array[i+1].toCharArray();
				  }else {
					  arr2=array[i+1].substring(0, array[i].length()).toCharArray();
					  arr1=array[i].toCharArray();
				  }
				  temp="";
			  for(int j=0;j<arr1.length;j++){
				  if(arr1[j]==arr2[j]) {
					  temp=temp+arr1[j];
				  }else {
					  break;
				  }
				  
				  }
			  array[i+1]=temp;
			  
			  }
		  
		  }
		  if(array.length<2) {
			  System.out.println(array[0]);
		  }else {
			  System.out.println(temp);
		  }
		  
	  }
	  
	}
