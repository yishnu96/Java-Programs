
public class RemoveConcutiveDublicates {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		
		LinkedListNode<Integer> currNode = head,temp=head.next;
				
		while(temp != null)
		{ 
//			System.out.println("Curr="+currNode.data+" next="+temp.data);
			if(currNode.data == temp.data)
			{
				temp =temp.next;
			}
			
			else
			{
//				System.out.println("Curr="+currNode.data+" next="+temp.data);
				currNode=temp;
				temp=temp.next;
			}
		}
		
		
		return head;
	}

}
