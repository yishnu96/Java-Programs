import java.util.Scanner;
import java.util.Stack;

public class Runner {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args)  {
//		String input = s.nextLine();
//		System.out.println(Balance.checkBalanced(input));
//		System.out.println(Balance.checkRedundantBrackets(input));
//		String str = s.nextLine();
//		System.out.println(count.countBracketReversals(str));
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		int output[] = stock.stockSpan(input);
		for(int i = 0; i < size; i++) {
			System.out.print(output[i] + " ");
		}
	}




//public class Runner {
//
//	static Scanner s = new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		int size = s.nextInt();
//		Stack<Integer> input = new Stack<Integer>();
//		for(int i = 0; i < size; i++) {
//			input.push(s.nextInt());
//		}
//		System.out.println(input.peek());
//		Stack<Integer> extra = new Stack<Integer>();
//		Reverse.reverseStack(input, extra);
//		
//		System.out.println(input.peek());
//		while(!input.isEmpty()) {
//			System.out.print(input.pop() + " ");
//		}
//	}
}