
public class findnode {

	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
		
		int count = 0;
		
		while(head!= null)
		{
			if(head.data == n)
				return count;
			
			else
			{
				count++;
				head = head.next;
			}
		}
		
		return -1;
	}

}
