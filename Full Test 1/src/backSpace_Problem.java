import java.util.Scanner;
import java.util.Stack;

public class backSpace_Problem {
	
	public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String n=s.next();
        String x=backspace(n);
        System.out.print(x);
    }

	private static String backspace(String n) {
		
		Stack<Character> s = new Stack<Character>();
		String ans = "";
		for (int i = 0; i < n.length(); i++) {
			
			if(n.charAt(i) != '#')
				s.add(n.charAt(i));
			
			else if(!s.isEmpty())
				s.pop();
		}
		
		while(!s.isEmpty())
		{
			ans = s.pop() + ans;
		}
		
		return ans;
	}
	
}
