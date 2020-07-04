import java.util.Scanner;


//class BinaryTreeNode<T> {
//	T data;
//	BinaryTreeNode<T> left;
//	BinaryTreeNode<T> right;
//
//	public BinaryTreeNode(T data) {
//		this.data = data;
//	}
//}

public class BST_creation {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int choice, input;
		while(true) {
			choice = s.nextInt();
			switch(choice) {
				case 1 : 
					input = s.nextInt();
					bst.insertData(input);
					break;
				case 2 : 
					input = s.nextInt();
					bst.deleteData(input);
					break;
				case 3 : 
					input = s.nextInt();
					System.out.println(bst.search(input));
					break;
				default :
					bst.printTree();
					return;
			}

		}
	}
}


class BinarySearchTree {

	BinaryTreeNode<Integer> node;
	int size=0;
	
	public void printTree() {
		printTree(node);		
	}
	
	public void deleteData(int input) {
		BSTReturn output = deleteData(node,input);		
		node = output.root;
		if(output.delete)
			size--;
	}

	private BSTReturn deleteData(BinaryTreeNode<Integer> root, int data) {
		
		if(root == null)
			return new BSTReturn(null, false);
		
		if(root.data < data)
		{
			BSTReturn right = deleteData(root.right, data);
			root.right = right.root;
			right.root = root;
			return right;
		}
		
		if(root.data > data)
		{
			BSTReturn left = deleteData(root.left, data);
			root.left = left.root;
			left.root = root;
			return left;
		}
		
		if(root.left == null && root.right == null)
			return new BSTReturn(null, true);
		
		if(root.left != null && root.right == null)
			return new BSTReturn(root.left, true);
		
		if(root.left == null && root.right !=null)
			return new BSTReturn(root.right, true);
		
		int rightMin = minimum(root.right);
		root.data = rightMin;
		BSTReturn output = deleteData(root.right, rightMin);
		root.right = output.root;
		return new BSTReturn(root, true);
		
	}

	public void insertData(int input) {
		size++;
		node = insertData(node , input);
	}

	private BinaryTreeNode<Integer> insertData(BinaryTreeNode<Integer> root, int input) {
		if(root == null)
		{
			BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(input);
			return newRoot;
		}
		
		if(input < root.data)
			root.left = insertData(root.left, input);
		else
			root.right = insertData(root.right, input);
		
		return root;
	}

	public boolean search(int input) {
		return search(node,input);
	}

	private boolean search(BinaryTreeNode<Integer> root, int x) {
		if(root==null)
			return false;
		
		if(root.data == x)
			return true;
		
		if(root.data > x)
			search(root.left, x);
		
		if(root.data < x)
			search(root.right, x);
		
		return false;
		
	}

	private void printTree(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return;
		
		System.out.println(	root.data + ":");
		
		if(root.left != null)
			System.out.println("L:"+root.left.data+",");
		
		if(root.right!=null)
			System.out.println("R:"+root.right.data);
		
		printTree(root.left);
		printTree(root.right);
		
	}
	
	public static int minimum(BinaryTreeNode<Integer> root) {

		if(root==null)
			return Integer.MAX_VALUE;

		int left=minimum(root.left);
		int right=minimum(root.right);

		return Math.min(root.data, Math.min(left, right));
	}
	
	
}

class BSTReturn{
	
	BinaryTreeNode<Integer> root;
	boolean delete;
	
	public BSTReturn(BinaryTreeNode<Integer> root, boolean delete) {
		this.root = root;
		this.delete = delete;
	}
}
