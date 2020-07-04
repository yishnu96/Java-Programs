
public class sort {

	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {

		LinkedListNode<Integer> node=head,oddHead=null,evenHead=null,
				input,oddtail = null,eventail=null;
		
		while(node!=null)
		{
			input=new LinkedListNode<Integer>(node.data);
			System.out.println();
			if(node.data%2==1)
			{
				if(oddHead==null) {
					oddHead = input;
					oddtail=input;
				}
				else {
					oddtail.next = input;
					oddtail=oddtail.next;
				}
				node=node.next;
			}
			else
			{
				if(evenHead==null) {
					evenHead = input;
					eventail=input;
				}
				else {
					eventail.next = input;
					eventail=eventail.next;
				}
				node=node.next;
			}
		}
		
		if(oddtail == null){
			return evenHead;}
		else{
			oddtail.next = evenHead;}
		return oddHead;
	}

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		
		int count = count(head);
		
		for(int i=0;i<count;i++)
		{
			LinkedListNode<Integer> curr = head;
			LinkedListNode<Integer> prev = null;
			for(int j = 0; j < count-i-1; j++) {
				
				if(curr.data <= curr.next.data)
				{
					prev=curr;
					curr=curr.next;
				}
				else
				{
					LinkedListNode<Integer> fNode=curr;
					LinkedListNode<Integer> sNode=curr.next;
					LinkedListNode<Integer> sNodeNext=sNode.next;
					
					if(prev !=null)
						prev.next = sNode;
					else
						head=sNode;
					prev = sNode;
					sNode.next = fNode;
					fNode.next=sNodeNext;
				}
			}
		}
		
		return head;
	}
	
	private static int count(LinkedListNode<Integer> head) {
		int count = 0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}
	
}
