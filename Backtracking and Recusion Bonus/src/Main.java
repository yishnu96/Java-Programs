import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		int sum = s.nextInt();
		System.out.println(string.numberOfWays(arr, 0, sum,""));
	}
}