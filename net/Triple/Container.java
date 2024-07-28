package com.net.Triple;

import java.util.*;

class Container {

    public static void main(String[] args) {

    	
//        Scanner sc = new Scanner(System.in);
//        int nom = sc.nextInt();
//        
//          for (int n = 0; n <nom; n++) {
//		int sum=0;
//		int add=0;
//		int last=0;
//		  int numberofContainer = sc.nextInt();
//		  int [] arr1 =new int[numberofContainer];
//		    int [] arr2 =new int[numberofContainer];
//		    for (int i = 0; i < numberofContainer; i++) {
//		        arr1[i]=sc.nextInt();
//		    }
//		      for (int j = 0; j < numberofContainer; j++) {
//		          {
//		              arr2[j]=sc.nextInt();
//		          }
//		      }
		int [] arr1= {1,2,3};
		int [] arr2= {0,0,0};
		
		      int sum=0;
				int add=0;
				int last=0;
				
        for(int i=0;i<3;i++) {
        	int t=arr2[i]+add;
        	if(t>=arr1[i]) {
        		sum=sum+t-arr1[i];
        		add=arr1[i];
        		last=arr1[i];
        	}else {
        		last=t;
        		add=t;
        	}
        	
        
        
	}
	System.out.println(last+" "+sum);
    }

}