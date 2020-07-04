import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int j = 0; j < n; j++) {
			input[j] = s.nextInt();
		}
//		Heap_sort.inplaceHeapSort(input);
//		for(int i : input) {
//			System.out.print(i + " ");
//		}
		
//		System.out.println(Solution.checkMaxHeap(input));
		
		int k = s.nextInt();
		System.out.println(Solution.kthLargest(input, k));
		
//		ArrayList<Integer> output = Solution.kLargest(input, k);
//		ArrayList<Integer> output = Solution.kSmallest(input, k);
//		for(int i : output) {
//			System.out.println(i);
//		}
	}
}