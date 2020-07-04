
public class Solution {

	public static LinkedListNode<Integer> addNumbers(LinkedListNode<Integer> head1,
			LinkedListNode<Integer> head2, int cri) 
	{
		
		if(head1==null && head2==null)
		{
			if(cri!=0)
				return new LinkedListNode(cri);
			return null;
		}
		
		int digit1 = head1==null? null: 0;
		int digit2 = head2==null? null: 0;
		
		int sum = (digit1+digit2)/10;
			cri = (digit1+digit2)%10;
		
		LinkedListNode<Integer> head = new LinkedListNode<Integer>(sum);
		head.next = addNumbers(head1.next, head2.next, cri);
		
		return head;
	}

}
