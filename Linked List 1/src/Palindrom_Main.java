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

public class  Palindrom_Main  {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print(Palindrom.isPalindrome_2(input()));
	}

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

}

