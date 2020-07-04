import java.util.Stack;

public class Balance {

	public static boolean checkBalanced(String exp) {
		
		Stack<Character> stack=new Stack<Character>();
		
		for (int i = 0; i < exp.length(); i++) {
			if(exp.charAt(i)=='{' || exp.charAt(i)=='[' || exp.charAt(i)=='(')
				stack.push(exp.charAt(i));
			
			if(exp.charAt(i)=='}' || exp.charAt(i)==']' || exp.charAt(i)==')')
			{
				if(stack.isEmpty())
					return false;
				
				Character top = stack.peek();
				if(top=='{' || top=='[' || top=='(')
					System.out.println(stack.pop());//stack.pop();
				else
					return false;
			}
		}
		
		if(stack.isEmpty())
			return true;
		else
			return false;
	}

	public static boolean checkRedundantBrackets(String s) {
		Stack<Character> stack = new Stack<>(); 
		char[] str = s.toCharArray(); 
		for (char ch : str) { 
			if (ch == ')') 
			{ 
				char top = stack.pop(); 
				boolean flag = true; 

				while (top != '(') { 

					if (top == '+' || top == '-'|| top == '*' || top == '/')  
						flag = false; 
					top = stack.pop(); 
				} 

				if (flag == true) 
					return true; 
			} 
			else
				stack.push(ch); 
		}
		return false;
	}
}
