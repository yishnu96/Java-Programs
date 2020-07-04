import java.util.Scanner;
public class Main{

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
//		int m = s.nextInt();
//		int n = s.nextInt();
//		int input[][] = new int[m][n];
//		for(int i = 0; i < m; i++) {
//			for(int j = 0; j < n; j++) {
//				input[i][j] = s.nextInt();
//			}
//		}
//		System.out.println(Solution.minCostPath(input));
		
//		String str1 = s.nextLine();
//		String str2 = s.nextLine();
//		System.out.println(Solution.lcs(str1, str2));
//		System.out.println(Solution.editDistance(str1, str2));
//		int min_len = Solution.smallestSuperSequence(str1, str2);
//		System.out.print(min_len);
		
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int weight[] = new int[n];
//		for(int i = 0 ; i < n; i++){
//			weight[i] = s.nextInt();
//		}
//		int value[] = new int[n];
//		for(int i = 0 ; i < n; i++){
//			value[i] = s.nextInt();
//		}
//		int maxWeight = s.nextInt();
//		System.out.println(Solution.knapsack(weight, value, maxWeight, n));		
		
//		int n=s.nextInt();
//		int m=s.nextInt();
//		int arr[][]=new int[n][m];
//		for(int i=0;i<n;i++)
//			for(int j=0;j<m;j++)
//				arr[i][j]=s.nextInt();
//		System.out.println(Solution.findMaxSquareWithAllZeros(arr));
//		
//		int n = s.nextInt();
//		int arr[] = new int[n];
//		for(int i=0; i<n; i++){
//			arr[i] = s.nextInt();
//		}
//		System.out.println(Solution.getMaxMoney(arr, n));
		
		
		int numDenominations = s.nextInt();
		
//		int denominations[] = new int[numDenominations];
//		for(int i = 0; i < numDenominations; i++){
//			denominations[i] = s.nextInt();
//		}
		
		int value = s.nextInt();
		
		System.out.println(Solution.countWaysToMakeChange(denominations, value));
		
//		int N = s.nextInt();
//		int arr[] = new int[N];
//		for(int i = 0; i < N; i++)
//			arr[i] = s.nextInt();
//		System.out.println(Solution.getMin(arr, N));
		
	}
}