
public class Delete {

	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int pos) {
		
		LinkedListNode<Integer> currNode = head;		//3 4 5 2 6 1 9 -1

		if(head == null)
			return null;

		if(head.next ==null && pos ==0)
			return null;
		int count=0;
		while(currNode!=null)
		{
			count++;
			currNode=currNode.next;
		}
		System.out.println("fucking = "+ currNode);
		if(pos==count)
		{
			return head;
		}
		currNode=head;
		if(head.next != null && pos ==0)
		{
			currNode = head;
			head = head.next;
			currNode.next = null;
		}
		else
		{
			count=0;

			while(count < pos && currNode.next != null)
			{
				count++;
				currNode=currNode.next;
			}
			if(currNode.next!=null)
				currNode.next=currNode.next.next;
		}

		return head;
	}

}
