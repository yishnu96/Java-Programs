import java.util.Scanner;

public class Print_Main {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		//int k = s.nextInt();
		//Print_type.printSubsetsSumTok(input, k);
		Print_type.printSubsets(input);
	}
}
