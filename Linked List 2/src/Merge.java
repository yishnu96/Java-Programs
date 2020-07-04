import com.sun.net.httpserver.Authenticator.Result;

public class Merge {

	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
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
		
		//---------------------------------------------------------------------------------
/*		LinkedListNode<Integer> t1=head1,t2=head2;
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
		
			if(t1.data <= t2.data)				if(t1.data<=t2.data)
			{									{
				tail=t1;							tail.next = t1;
				t1=t1.next;							tail=t1;
				tail=tail.next;						t1=t1.next;
			}									}
			
			
			else
			{
				tail=t2;
				t2=t2.next;
				tail=tail.next;
			}
		}
		
		if(t1!=null)
			tail=t1;
		else
			tail=t2;
		
		return head;*/
	}

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {

		if(head==null||head.next==null)
			return head;
		
		LinkedListNode<Integer> mid = Midpoint.mid(head);
		LinkedListNode<Integer> midhead = mid.next;
								mid.next=null;
		LinkedListNode<Integer> left = mergeSort(head);
		LinkedListNode<Integer> right = mergeSort(midhead);
		
		LinkedListNode<Integer> Result = mergeTwoList(left, right);
		return Result;
	}

}
