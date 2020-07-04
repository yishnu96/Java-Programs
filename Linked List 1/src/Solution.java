
public class Solution {

	public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
		
		Node<Integer> temp = new Node<Integer>(data);
		Node<Integer> currentNode = head;
		
//		if(head==null)
//		{
//			temp.next = null;
//			head= temp;
//		}

		if(pos == 0)
		{
			temp.next= head;
			head=temp;
		}
		else {
			int count = 1;

			while(count < pos )
			{
				if(currentNode==null)
					return head;

				count++;
				currentNode = currentNode.next;
			}
			if(pos==count+1)
			{
				temp.next = null;
				currentNode.next=temp;
			}
			else {
				temp.next=currentNode.next;
				currentNode.next = temp;
			}
		}
		return head;
	}

}
