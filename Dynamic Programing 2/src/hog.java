import java.util.Scanner;

public class hog {

	static boolean isSubsetSum(int arr[], int sum) 
	{ 
		int n = arr.length;
		boolean dp[][] =  new boolean[sum+1][n+1]; 

		for (int i = 0; i <= n; i++) 
			dp[0][i] = true; 

		for (int i = 1; i <= sum; i++) 
			dp[i][0] = false; 

		for (int i = 1; i <= sum; i++) 
		{ 
			for (int j = 1; j <= n; j++) 
			{ 
				dp[i][j] = dp[i][j-1]; 
				if (i >= arr[j-1]) 
					dp[i][j] = dp[i][j] ||  
					dp[i - arr[j-1]][j-1]; 
			} 
		} 

//		for (int i = 0; i <= sum; i++) 
//		{ 
//			for (int j = 0; j <= n; j++) 
//				System.out.println (dp[i][j]); 
//		} 

		return dp[sum][n]; 
	} 

	public static void main (String args[]) 
	{ 
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = s.nextInt();
		}
		
		int sum =s.nextInt(); 
		if (isSubsetSum(arr, sum) == true) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 

}
