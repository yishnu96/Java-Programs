import java.util.Scanner;

public class Main {
	
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
		
		int k = s.nextInt();
		int output[][] = solution.subsetsSumK(input,0, k);
		//int output[][] = solution.subsets(input,0);
		//solution.printSubsetsSumTok(input, 0,k);
		
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
