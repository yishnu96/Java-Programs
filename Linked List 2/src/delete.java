
public class delete {

	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int m, int n) {

		LinkedListNode<Integer> currNode=head,temp;
		while(currNode!= null)
		{
			for (int i = 1; i < m && currNode!=null; i++) 
				currNode=currNode.next;
			
			if(currNode==null)
				break;
			
			temp = currNode.next;
			
			for(int i=0;i<n&& temp!=null;i++)
				temp=temp.next;
			currNode.next=temp;
			currNode=temp;
		}
		return head;
	}

}
