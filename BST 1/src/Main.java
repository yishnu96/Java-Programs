import java.util.Scanner;
 class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
 
public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i = 0; i < len; ++i) {
			arr[i] = sc.nextInt();
		}
		BinaryTreeNode<Integer> ans = Solution.SortedArrayToBST(arr, 0 ,arr.length - 1);
		
		preOrder(ans);
	}
	
	private static void preOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
}
