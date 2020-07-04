import java.util.Queue;
import java.util.Stack;

public class Reverse {

	public static void reverseQueue(Queue<Integer> queue) {
		
		Stack<Integer> stack=new Stack<Integer>();
		
		while(!queue.isEmpty())
		{
			stack.push(queue.dequeue());
		}
		while(!stack.isEmpty())
		{
			queue.enqueue(stack.pop());
		}
	}

	public static Queue<Integer> reverseKElements(Queue<Integer> q, int k) {
		
		Stack<Integer> s=new Stack<Integer>();
		while(k>0)
		{
			s.push(q.remove());
			k--;
		}
		while(!s.isEmpty())
		{
			q.add(s.pop());
		}
		
		for(int i = 0;i<q.size()-k;i++)
		{
			q.add(q.poll());
		}
		
		return q;
	}
}
