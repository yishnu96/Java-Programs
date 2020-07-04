import java.util.Arrays;
import java.util.Vector;

public class Print_type {

	public static void printSubsetsSumTok(int[] input, int k) {
		int[] v = new int[input.length];	//Create Dynamic Array
		printSubsetsSumTok(input,0,v, k);
	}

	private static void printSubsetsSumTok(int[] arr, int pos, int[] output, int sum) {
		
		
			if(sum==0)
			{
				for (int i = 0; i < output.length; i++) 
					System.out.print(Arrays.toString(output));
			}
			else	
				return;
			
			if(pos == arr.length)
				return;
		
		printSubsetsSumTok(arr, pos + 1, output, sum);
		
		int[] newarray =new int[output.length + 1];
		newarray[0] = arr[pos];
		for (int i = 0; i < output.length; i++) {
			newarray[i+1] = output[i];
			
		}
		
		printSubsetsSumTok(arr, pos +1, newarray, sum - arr[pos]);
	}

	public static void printSubsets(int[] input) {
		
		int arr[][] = {{}};
		printSubsets(input,0,arr);
		
	}

	private static void printSubsets(int[] input, int Index, int[][] output) {
		
		if(Index == input.length)
			for (int i = 0; i < output.length; i++) {
				System.out.println(output[i]);
			}
		
		printSubsets(input, Index+1, output);
		
		int[] newarr= new int[output.length + 1];
		newarr[0] = input[Index];
		for (int i = 0; i < output.length; i++) {
			input[i+1] = output[i];
		}
		
		printSubsets(input, Index+1, output);
		
		
	}

}





















