package com.net.Important;

import java.math.BigInteger;

public class TrailingZeros {

	public static void main(String[] args) {
    	int n=25;
    	
    	BigInteger factorial=BigInteger.ONE;
    	
    	for(int i=1;i<=n;i++) {
    		factorial=factorial.multiply(BigInteger.valueOf(i));
    	}
    	System.out.println(factorial);
    	
    	int count=0;
    	while(factorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
	    		count++;
	    		factorial=factorial.divide(BigInteger.TEN);
    	}
    	
    	System.out.println(count);
    }

}
