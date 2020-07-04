
public class Solution {

	public static long staircase(int n) {
		
		long dp[] = new long[n+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		
		for (int i = 3; i < dp.length; i++) {
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
		
		return dp[n];
	}

	public static int countStepsTo1(int n) {
		
//		if(n  == 1)
//			return 0;
//		
//		int optn1 = countStepsTo1(n-1);
//		
//		int optn2 = Integer.MAX_VALUE;
//		if(n%2 == 0)
//			optn2 = countStepsTo1(n/2);
//		
//		int optn3 = Integer.MAX_VALUE;
//		if(n%3 == 0)
//			optn3 = countStepsTo1(n/3);
//		
//		return 1 + Math.min(optn1, Math.min(optn2, optn3));
		
		int[] dp=new int[n+1];
		for (int i = 0; i < dp.length; i++) 
			dp[i] = -1;
		
		return countStepsTo1(n,dp);
		
	}

	private static int countStepsTo1(int n, int[] dp) {
		
		if(n==1)
			return 0;
		
		int optn1,optn2 = Integer.MAX_VALUE,optn3 = Integer.MAX_VALUE;
		
		if(dp[n-1] == -1)
		{
			optn1 = countStepsTo1(n-1,dp);
			dp[n-1] = optn1;
		}
		else
			optn1 = dp[n-1];
		
		if(n%2 == 0)
		{
			if(dp[n/2] == -1)
			{
				optn2 = countStepsTo1(n/2,dp);
				dp[n/2] = optn2;
			}
			else
				optn2 = dp[n/2];
		}
		
		if(n%3 == 0)
		{
			if(dp[n/3] == -1)
			{
				optn3 = countStepsTo1(n/3,dp);
				dp[n/3] = optn3;
			}
			else
				optn3 = dp[n/3];
		}
		
		return 1 + Math.min(optn1, Math.min(optn2, optn3));
		
		
	}

	public static int minCount(int n) {
		
		int[] dp=new int[n+1];
		for (int i = 0; i < dp.length; i++) 
			dp[i] = -1;
		
		return minCount(n,dp);
	}

	private static int minCount(int n, int[] dp) {
		
		if(n==0)
			return 0;
		
		int minAns = Integer.MAX_VALUE;
		for (int i = 1; i*i <=n; i++) {
			int curr; 
			if(dp[n-(i*i)] == -1)
			{
				curr = minCount(n-(i*i),dp);
				dp[n-(i*i)] = curr;
			}
			else
				curr = dp[n-(i*i)];
			
			if(minAns > curr)
				minAns = curr;
			
		}
		
		return minAns + 1;
	}

	public static long bytelandian(long n) {
		
		long[] dp = new long[(int) (n+1)];
		
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 2; i < dp.length; i++) {
			
			long optn1 = 0;
			if(i%2 == 0)
				optn1 = dp[i/2];
			
			long optn2 = 0;
			if(i%3 == 0)
				optn2 = dp[i/3];
			
			long optn3 = 0;
			if(i%4 == 0)
				optn3 = dp[i/4];
			
			dp[i] = optn1 + optn2 + optn3;
			
		}
		
		return dp[(int) n];
		
	}

	public static int getMaxMoney(int[] arr, int n) {
		
		int[] dp = new int[n];
		
		dp[0] = arr[0];
		dp[1] = Math.max(arr[1], arr[0]);
		
		for (int i = 2; i < dp.length; i++) {
			int k = arr[i] + dp[i-2];
			dp[i] = Math.max( k, dp[i-1]);
			
		}
		
		return dp[n-1];
		
	}

	public String solve(int n, int x, int y) {
		
		int[] dp = new int[n+1];
		
		for (int i = 1; i < dp.length; i++) {
			int optn1 = dp[i-1];
			int optn2 = 0;
			if(i-x >= 1)
				optn2 = dp[i-x] ^ 1;
			
			int optn3 = 0;
			if(i-y >= 1)
				optn3 = dp[i-y] ^ 1;
			
			dp[i] = optn1 + optn2 + optn3;
			
		}
		
		String ans = "";
		if(dp[n] != 0)
			ans = "Whis";
		else
			ans = "Beerus";
		
		return ans;
	
	} 

}

























