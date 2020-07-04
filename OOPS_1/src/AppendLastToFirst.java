
public class AppendLastToFirst {

	public static LinkedListNode<Integer> append(LinkedListNode<Integer> head, int num) {
		
		LinkedListNode<Integer> currNode = head,newhead,temp=head;
		int count=0;								//524 541 9 915 273 443 564 231 861 643 746 12 781 813 956 522 36 35 706 881 -1 5
		
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
//			
//		System.out.println(count);
		num = count-num;
		count=0;	temp= head;
		
		while(count < num-1)
		{
			count++;
			currNode=currNode.next;
			temp=temp.next;
		}
		currNode=currNode.next;
		newhead=temp.next;
		temp.next=null;
		
//		System.out.println("Current=" + currNode.data + " temp="+temp.data + " next="+temp.next);
//		System.out.println(" new Head = " + newhead.data);
		
		while(currNode.next != null)
			currNode=currNode.next;
		
//		System.out.println("Last node = "+currNode.data);
		currNode.next=head;
		
		return newhead;
	}

}
