import java.util.Stack;

public class Reverse {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		
		if(input.isEmpty() || extra.isEmpty())
			return;
		
		extra.push(input.pop());
		System.out.println(extra.peek());
		reverseStack(input, extra);

		input.push(extra.pop());
		System.out.println(input.peek());
	}

	

}
 