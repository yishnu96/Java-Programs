
public class Palindrom {

	public static boolean isPalindrome_2(LinkedListNode<Integer> head) {

		LinkedListNode<Integer> currNode=head,mid = head,midhead;
		
		while(currNode.next!=null && currNode.next.next!=null)
		{
			mid=mid.next;
			currNode = currNode.next.next;
//			System.out.println("Cuu="+currNode.data+" mid="+mid.data);
		}
		
		midhead = mid.next;
		mid.next=null;
//		System.out.println(midhead + " last="+mid.data+ " "+mid.next);
		midhead = reverseLinkedList(midhead);
		
//		while(midhead!=null) {
//			System.out.print(midhead.data+" ");
//			midhead=midhead.next;
//		}
		
		while(head != null && midhead != null)
		{
			if(head.data.equals(midhead.data))
			{
				head=head.next;
				midhead=midhead.next;
			}
			else
				return false;
		}
		return true;
	}

	private static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
		
		if(head == null)
			return head;
		
		if(head.next == null)
			return head;
		
		LinkedListNode<Integer> temp = reverseLinkedList(head.next);
		head.next.next =head;
		head.next = null;
		return temp;
	}

}
