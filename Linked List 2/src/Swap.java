
public class Swap {

	public static LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head, int i, int j) {

		LinkedListNode<Integer> node =head,fiListNode = null,secondNode = null,temp;
		int count = 0;
		
		while(node!=null)
		{
			if(count == i-1) 
				fiListNode = node;
				
			if(count == j-1)
				secondNode = node;
			
			count++;
			node=node.next;
		}
		
		System.out.println("Fist="+fiListNode.data+" second="+secondNode.data);
		System.out.println("Fnex="+fiListNode.next + "SeNode="+secondNode.next);
		node=head;
		

		if(i==0){
            temp=secondNode.next;
            secondNode.next=head;
            head=temp;
            
            temp=secondNode.next.next;
            secondNode.next.next=head.next;
            head.next=temp;
            return head; 
        }
			
		if(j==0){
            temp=fiListNode.next;
            fiListNode.next=head;
            head=temp;
            
            temp=fiListNode.next.next;
            fiListNode.next.next=head.next;
            head.next=temp;
            return head; 
        }
		
		if(fiListNode!=null && secondNode!=null)
		{
			temp=fiListNode.next;
			fiListNode.next=secondNode.next;
			secondNode.next = temp;
			
			temp=fiListNode.next.next;
			fiListNode.next.next=secondNode.next.next;
			secondNode.next.next=temp;
		}
		
		return head;
	}

}
