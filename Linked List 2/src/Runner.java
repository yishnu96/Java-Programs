
import java.util.Scanner;

class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static LinkedListNode<Integer> input() {
		LinkedListNode<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}
	}

	
	public static void main(String[] args) {
//		LinkedListNode<Integer> head = takeInput();
//		int n = s.nextInt();
//		System.out.println(findnode.indexOfNRec(head, n));
//		print(deleteing.skipMdeleteN(input(), s.nextInt(), s.nextInt()));
//		print(Swap.swap_nodes(input(), s.nextInt(), s.nextInt()));
//		print(sort.sortEvenOdd(input()));
//		print(delete.skipMdeleteN(input(), s.nextInt(), s.nextInt()));
//		print(Reverse.kReverse(input(), s.nextInt()));
//		print(Merge.mergeSort(input()));
		print(sort.bubbleSort(input()));
		
//		LinkedListNode<Integer> head1 = input();
//		LinkedListNode<Integer> head2 = input();
//		LinkedListNode<Integer> head3 = Merge.mergeTwoList(head1, head2);
//		print(head3);
	}
}