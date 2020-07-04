
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
 class QueueEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}

 class QueueUsingLL<T> {

	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException{
		if(size == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}


	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException{
		if(head == null){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if(head == tail){
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}

 class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
 
public class Runner {

	static Scanner s = new Scanner(System.in);

	public static BinaryTreeNode<Integer> takeInput(){
		QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>(); 
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			int leftChildData = s.nextInt();
			if(leftChildData != -1){
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}
			int rightChildData = s.nextInt();
			if(rightChildData != -1){
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}
		return root;
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root){
		
		QueueUsingLL<BinaryTreeNode<Integer>>  queue1 = new QueueUsingLL<BinaryTreeNode<Integer>>();
		QueueUsingLL<BinaryTreeNode<Integer>>  queue2 = new QueueUsingLL<BinaryTreeNode<Integer>>();

		queue1.enqueue(root);

		while(!queue1.isEmpty())
		{
			BinaryTreeNode<Integer> curr=null;
			try 
			{
				curr = queue1.dequeue();
			} 
			catch (QueueEmptyException e) 
			{
				System.out.println("Not possible");
			}
			
			System.out.print(curr.data + " ");
			
			if(curr.left != null)
				queue2.enqueue(curr.left);
			if(curr.right != null)
				queue2.enqueue(curr.right);
			if(queue1.isEmpty()){
				QueueUsingLL<BinaryTreeNode<Integer>>  temp = queue2;
				queue2 = queue1;
				queue1 = temp;
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput();
//		Mirror.mirror(root);								//Mirror a tree
//		System.out.println(Balance.checkBalance(root));				//Check Balance
//		System.out.println(Balance.diameterOfBinaryTree(root));		//Diameter of Binary Tree
//		BT k = Balance.diameterOfBinaryTree(root);
//		System.out.println(k.diameter);
		
//		System.out.println(Balance.height(root));
		
//		PairAns ans = Solution.minMax(root);		//Find min and max
//		System.out.println(ans.max + " " + ans.min);	
		
//		Solution. rootToLeafPathsSumToK(root,s.nextInt(),"");
		
//		Solution.printLevelWise(root);			//Print tree
//		printLevelWise(root);
		
		Solution.nodesAtDistanceK(root, s.nextInt(), s.nextInt());
	}
}


class PairAns {
	int min;
	int max;
} 
