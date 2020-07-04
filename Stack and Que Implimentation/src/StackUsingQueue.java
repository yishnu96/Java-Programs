import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue<T> {
	Queue<T> s1,s2;
	int size;
	
	public StackUsingQueue() {
		s1=new LinkedList<T>();
		s2=new LinkedList<T>();
		size=0;
	}

	public void push(T input) {  
		size++;
		s1.add(input);
	}

	public T pop() {
		if(s1.isEmpty())
			return null;
		
		while(s1.size()!=1)
			s2.add(s1.remove());
		T temp=s1.remove();
		Queue<T> q;
		q=s1;
		s1=s2;
		s2=q;
		
		size--;
		return temp;
	}

	public T top() {
		if(s1.isEmpty())
			return null;
		
		while(s1.size()!=1)
			s2.add(s1.remove());
		T temp=s1.remove();
		s2.add(temp);
		Queue<T> q;
		q=s1;
		s1=s2;
		s2=q;
		return temp;
	}

	public int getSize() {
		return size;
	}

	public Queue<T> getQueue() {
		return s1;
	} 
		
}
