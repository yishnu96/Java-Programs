import java.util.Scanner;

public class grid {
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int testcase = s.nextInt();
		
		for (int k = 0; k < testcase; k++) {
			int row = s.nextInt();
			int col = s.nextInt();
			int[][] arr = new int[row][col];
			for(int i=0; i<row; i++)
				for(int j=0;j<col;j++)
					arr[i][j] = s.nextInt();
			
			int ans = magic_grid(arr,row,col);
			System.out.println(ans);
					
		}
	}

	private static int magic_grid(int[][] arr, int row, int col) {
		
		int[][] dp = new int[row+1][col+1];
		
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= col; j++) 
				dp[i][j] = Integer.MAX_VALUE;
		}
		dp[row][col-1] = 1;
		dp[row-1][col] = 1;
		
		for(int i=row-1; i>=0; i--) {
			for(int j=col-1; j>=0; j--)
			{
				int left = dp[i+1][j];
				int right = dp[i][j+1];
				
				int ans = arr[i][j] - Math.min(left, right);
				dp[i][j] = Math.max(ans, 1);
			}
		}
		
		return dp[0][0];
	}

}























