import java.util.Arrays;

public class Solution {

	public static int minCostPath(int[][] input) {
		
		int m = input.length;
		int n = input[0].length;
		
		int dp[][] = new int[m+1][n+1];
		
		for (int i = 0; i < dp.length; i++) 
			for (int j = 0; j < dp[i].length; j++) 
				dp[i][j] = Integer.MAX_VALUE;
		
		for (int i = m-1; i >=0; i--) {
			for(int j = n-1; j >=0;j--)
			{
				if(i==m-1 && j==n-1)
				{
					dp[i][j] = input[i][j];
					continue;
				}
				
				int ans1 = dp[i][j+1];
				int ans2 = dp[i+1][j];
				int ans3 = dp[i+1][j+1];
				
				dp[i][j] = input[i][j] + Math.min(ans1, Math.min(ans2, ans3));
			}
		}
		return dp[0][0];
	}

	public static int lcs(String str1, String str2) {
		
		int m = str1.length();
		int n = str2.length();
		
		int[][] dp = new int[m+1][n+1];
		
		for(int i=m-1; i>=0; i--) {
			for(int j=n-1; j>=0; j--)
			{
				int ans;
				if(str1.charAt(i) == str2.charAt(j))
					ans = 1 + dp[i+1][j+1];
				
				else {
					int ans1 = dp[i][j+1];
					int ans2 = dp[i+1][j];
					ans = Math.max(ans1, ans2);
				}
				dp[i][j] = ans;
			}
		}
		
		return dp[0][0];
	}

	public static int editDistance(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();
		int dp[][] = new int[m + 1][n + 1]; 
		  
        for (int i = 0; i <= m; i++) 
        { 
        	
            for (int j = 0; j <= n; j++) 
            { 
                if (i == 0) 
                    dp[i][j] = j; 
  
                else if (j == 0) 
                    dp[i][j] = i; 
  
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) 
                    dp[i][j] = dp[i - 1][j - 1]; 
  
                else
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1])); 
            } 
        } 
  
        return dp[m][n]; 
	}

	public static int knapsack(int[] weight, int[] value, int maxWeight, int n) {

		int[][] dp = new int[n+1][maxWeight+1];
		
		for(int i=n-1;i>=0;i--)
		{
			for(int w=0;w <= maxWeight; w++)
			{
				int ans;
				if(weight[i] <= w)
				{
					int ans1 = value[i] + dp[i+1][w - weight[i]];
					int ans2 = dp[i+1][w];
					ans = Math.max(ans1, ans2);
				}
				else
					ans = dp[i+1][w];
				
				dp[i][w] = ans;
			}
		}
		
		return dp[0][maxWeight];
	}

	public static int findMaxSquareWithAllZeros(int[][] arr) {
		
		int row = arr.length;
		int cols = arr[0].length;
		
		int[][] dp = new int[row][cols];
		
		for (int i = 0; i <cols; i++) 
			dp[0][i] = arr[0][i];
		
		for (int i = 0; i < row; i++) 
			dp[i][0] = arr[i][0];
		

		for (int i = 1; i <row; i++) 
		{
			for (int j = 1; j <cols; j++) 
			{
				if (arr[i][j] == 0) 
					dp[i][j] = Math.min(dp[i - 1][j - 1],Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
				else 
					dp[i][j] = 0;
			}
		}
		
		int max = 0;
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < cols; j++)  
				if (dp[i][j] > max) 
					max = dp[i][j];
		}
		
		return max;
	}

	public static int smallestSuperSequence(String str1, String str2) {

		int m = str1.length();
		int n = str2.length();

		int[][] dp = new int[m + 1][n + 1]; 

		for (int i = 0; i <= m; i++) 
		{ 
			for (int j = 0; j <= n; j++) 
			{ 
				if (i == 0) 
					dp[i][j] = j; 

				else if (j == 0) 
					dp[i][j] = i; 

				else if (str1.charAt(i - 1) == str2.charAt(j - 1)) 
					dp[i][j] = 1 + dp[i - 1][j - 1]; 

				else
					dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]); 
			} 
		} 

		return dp[m][n]; 

	}

	public static int getMaxMoney(int[] arr, int n) {
		
		if (n == 0) 
			return 0; 

		int ans1 = arr[0]; 
		if (n == 1) 
			return ans1; 

		int ans2 = Math.max(arr[0], arr[1]); 
		if (n == 2) 
			return ans2; 

		int max = 0; 

		for (int i=2; i<n; i++) 
		{ 
			max = Math.max(arr[i]+ans1, ans2); 
			ans1 = ans2; 
			ans2 = max; 
		} 

		return max; 
	}

	public static int getMin(int[] arr, int n) {

		int[] ans1 = new int[n];
		int[] ans2 = new int[n];
		int sum = 0 ;
		ans1[0] = 1;
		ans2[n-1] = 1;
		int i , j;
		for ( i = 1,j = n-2; i < n; i++ , j--) {
			
			if(arr[i] > arr[i-1])
				ans1[i] = 1 + ans1[i-1];
			
			else if(arr[i] <= arr[i-1])
				ans1[i] = 1;
			
			if(arr[j] > arr[j+1])
				ans2[j] = 1 + ans2[j+1];
			
			else if(arr[j] <= arr[j+1])
				ans2[j] = 1;
			
		}
		
			System.out.println(Arrays.toString(ans1));
			System.out.println(Arrays.toString(ans2));
			
		for(int k = 0; k<n ;k++)
			sum = sum + Math.max(ans1[k], ans2[k]);
		
		return sum;
 	}

	public static int countWaysToMakeChange(int[] S, int n) {
		
		int table[]=new int[n+1]; 

		table[0] = 1; 

		for(int i=0; i<S.length; i++) 
			for(int j=S[i]; j<=n; j++) 
				table[j] += table[j-S[i]]; 

		return table[n];  
	}

	
		
}






















