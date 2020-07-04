import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		System.out.println(Solution.staircase(n));
//		System.out.println(Solution.countStepsTo1(n));
//		System.out.println(Solution.minCount(n));
//		System.out.println(Solution.bytelandian(n));
		
//		int arr[] = new int[n];
//		for(int i=0; i<n; i++){
//			arr[i] = s.nextInt();
//		}
//		System.out.println(Solution.getMaxMoney(arr, n));
	
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println(new Solution().solve(n,x,y));
	}

}
