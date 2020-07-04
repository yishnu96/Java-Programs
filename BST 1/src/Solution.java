
public class Solution {

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int start, int end) {
		
		if(start > end)
			return null;
		
		int mid=(start+end)/2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
		
		root.left=SortedArrayToBST(arr, start, mid-1);
		root.right=SortedArrayToBST(arr, mid+1, end);
		
		return root;
	}

	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root) {
		
		if(root == null )
			return null;
		
		BSTToSortedLL(root.left);
		
		LinkedListNode<Integer> head = createLinkedList(root.data);
		
		BSTToSortedLL(root.right);
		return head;
	}
	
	static LinkedListNode<Integer> head = null;
	static LinkedListNode<Integer> tail=null;
	private static BinaryTreeNode<Integer> root;
	
	private static LinkedListNode<Integer> createLinkedList(Integer data) {

		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);    

		if(head == null) {    
			head = newNode;    
			tail = newNode;    
		}    
		else {    
			tail.next = newNode;    
			tail = tail.next;    
		}   
		return head;
	}

	


}
