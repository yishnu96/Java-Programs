
import java.util.Scanner;


public class Runner {
	
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){
		
		System.out.println( "Enter Array Size : ");
		int size = s.nextInt();
		
		System.out.println("Enter Array :");
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = takeInput();
		//System.out.println(Solution.sum(input));
		
		//int[] arr = takeInput();
		int num = s.nextInt();
		//System.out.print(LinearSearch.linearSearch(arr, num));
		
		/*Solution.swapAlternate(input);
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] +" ");
		}
		*/
		//System.out.print(Solution.findUnique(arr));
		
		//Pair.pairSum(input, num);
		Pair.tripletSum(input, num);
		
	}

}
