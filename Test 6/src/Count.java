
public class Count {
	private static int lenght(LinkedListNode<Integer> head) {
		int count = 0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}
	
	private static int highest(LinkedListNode<Integer> head) {
		
		int max=0;
		while(head!=null)
		{
			if(head.data > max)
				max=head.data;
			head=head.next;
		}
		
		return max;
		
		
	}
}
