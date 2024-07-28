package com.net.Leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//leetcode = 7
		      int  x = -123;
              int temp=x;
              int rev=0;
		      while(temp!=0){
		            x=temp%10;
		            /* this is to check rev is max value and min value */
		            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
		               System.out.println(rev);
		            }
		            rev=rev*10+x;
		            temp=temp/10;
		        } 
            System.out.println(rev);
	}

}
