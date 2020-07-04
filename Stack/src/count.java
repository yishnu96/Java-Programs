import java.util.Stack;

public class count {

	public static int countBracketReversals(String expr){

		if(expr.length()%2==1)
			return -1;

		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();

		for (int i=0; i<expr.length(); i++) 
		{
			if(expr.charAt(i)=='{')
			{
				s1.push(1);
			}
			else
				s2.push(2);
			
		}
		int size;
		if(s1.size()>s2.size())
			size=s1.size()-s2.size();
		else
			size=s2.size()-s1.size();

		return size/2; 
	}

}
