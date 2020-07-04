
public class Midpoint {

	public static LinkedListNode<Integer> mid(LinkedListNode<Integer> head) {
		
		if(head==null)
			return head;
			
		LinkedListNode<Integer> currNode=head,mid = head,midhead;
		while(currNode.next!=null && currNode.next.next!=null)
		{
			mid=mid.next;
			currNode = currNode.next.next;
		}
		return mid;
	}

}
