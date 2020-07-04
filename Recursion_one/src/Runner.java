import java.util.Scanner;

public class Runner {

static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		
		int[] input = takeInput();
		int x = s.nextInt();
		
		//System.out.println(Solution.firstIndex(input, x));
		//System.out.println(Solution.checkNumber(input, x));
		//System.out.println(Solution.sum(input));
		//System.out.println(Solution.lastIndex(input, x));
		/*int output[] = Solution.allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}*/
		
		
	}
}
