import java.util.Arrays;
import java.util.Scanner;

public class distrubutin_problem {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt();
		
		int m = s.nextInt();
		System.out.println(findMinDiff(arr, m));
	}

	static int findMinDiff(int arr[],  int m) 
	{ 
		int n = arr.length;
		
		if (m == 0 || n == 0) 
			return 0; 

		Arrays.sort(arr); 

		if (n < m) 
			return -1; 

		int min_diff = Integer.MAX_VALUE; 

		for (int i = 0; i + m - 1 < n; i++) 
		{ 
			int diff = arr[i+m-1] - arr[i]; 
			if (diff < min_diff) 
				min_diff = diff; 
		} 
		return min_diff; 
	} 
}
