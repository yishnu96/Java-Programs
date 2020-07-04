


public class solution {

	public static void changeLL(LinkedListNode<Integer> head) {
		
		if(head==null || head.next==null)
			return;
		
		int max=highest(head);	max++;
		int length=lenght(head);
		LinkedListNode<Integer> curr=head,temp=null;
//		System.out.println("Head="+head.data+" max="+max+" length="+length);
//		head.data=max+1;max++;
//		System.out.println("Head="+head.data+" max="+max+" length="+length);
		
		for (int i = 0; i < length-1 && curr!=null; i++) {
			temp=curr.next;
			for (int j = i+1; j < length; j++) 
			{
				if(temp.data.equals(curr.data))
				{
					temp.data=max;
					max++;
				}
				temp=temp.next;
			}
			curr=curr.next;
		}
	}
			
	private static int lenght(LinkedListNode<Integer> head) {
		int count = 0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}
	
	private static int highest(LinkedListNode<Integer> head) {
		
		int max=0;
		while(head!=null)
		{
			if(head.data > max)
				max=head.data;
			head=head.next;
		}
		
		return max;
		
		
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
	
	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		LinkedListNode<Integer> t1=head1,t2=head2;
		LinkedListNode<Integer> head=null,tail=null;
		
		if(t1.data <= t2.data)
		{
			head=t1;
			tail=t1;
			t1=t1.next;
		}
		else
		{
			head=t2;
			tail=t2;
			t2=t2.next;
		}
		
		while(t1!=null && t2!=null)
		{
			if(t1.data <= t2.data)
			{
				tail.next=t1;
				tail=t1;
				t1=t1.next;
				
				// System.out.println("rsgd");
			}
			else
			{
				tail.next=t2;
				tail=t2;
				t2=t2.next;
				
			}
		}
		
		if(t1!=null)
			tail.next=t1;
		else
			tail.next=t2;
		
		return head;
	}
	 
	public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {
		
		LinkedListNode<Integer> ahead = new LinkedListNode<Integer>(0); 
		LinkedListNode<Integer> dhead = new LinkedListNode<Integer>(0); 
		LinkedListNode<Integer> curr = head,ascn=ahead,dscn=dhead; 

		while (curr != null) 
		{ 
			ascn.next = curr; 
			ascn = ascn.next; 
			curr = curr.next; 

			if (curr != null) 
			{ 
				dscn.next = curr; 
				dscn = dscn.next; 
				curr = curr.next; 
			} 
		} 

		dscn.next = null; ascn.next = null; 
		dhead=dhead.next; ahead=ahead.next;
		dhead=reverseLinkedList(dhead);
		runner.print(dhead);
		System.out.println();
		runner.print(ahead);
		System.out.println();
		head=mergeTwoList(ahead, dhead);
		
		return head;
	}

	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {

		if(head==null)
			return head;
		
		head=reverseLinkedList(head);
		LinkedListNode<Integer> curr=head;
		curr=curr.next;
		if(head.data<9)
			head.data++;
		else
		{
			head.data=0;
			while(curr.data == 9 && curr.next!=null)
			{
				curr.data=0;
				curr=curr.next;
			}
			if(curr.next==null) {
				curr.data=0;
				LinkedListNode<Integer> last=new LinkedListNode<Integer>(1);
				curr.next=last;
			}
			else
				curr.data++;
		}
		head=reverseLinkedList(head);

		return head;
	}
	
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
		
		 LinkedListNode<Integer> prev = null; 
	        LinkedListNode<Integer> current = head; 
	        LinkedListNode<Integer> next = null; 
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        head = prev; 
	        return head; 
		
	}

}
