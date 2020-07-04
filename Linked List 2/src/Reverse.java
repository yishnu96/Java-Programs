
public class Reverse {

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int n) {
		
		LinkedListNode<Integer> curr=head,next=null,prev = null;
		int count=0;
		
		while(curr!=null && count<n)
		{
			next = curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		
		if(next!=null)
			head.next=kReverse(next, n);
		
		return prev;
	}

}
