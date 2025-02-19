package com.net.Leetcode;

public class ClimbStairCase {
	//You are climbing a staircase. It takes n steps to reach the top.

	//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	
//	Input: n = 3
//			Output: 3
//			Explanation: There are three ways to climb to the top.
//			1. 1 step + 1 step + 1 step
//			2. 1 step + 2 steps
//			3. 2 steps + 1 step
	
	/* to reach step 6 = 
	 no of ways to reach step 5 + no of ways to reach step 4
	 * */
	
	public static void main(String[] args) {
		int n=6;
		
		int dp[] = new int[n+1];
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[n]);
	}

}
