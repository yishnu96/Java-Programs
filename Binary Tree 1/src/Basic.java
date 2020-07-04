import java.lang.Math;
public class Basic {

	public static int sum(BinaryTreeNode<Integer> root) {
		
		if(root==null)
			return 0;
		
		return root.data + sum(root.left) + sum(root.right);
	}

	public static void preOrder(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);

	}

	public static int Largest(BinaryTreeNode<Integer> root) {
		
		if(root==null)
			return 0;
		
		int left=Largest(root.left);
		int right=Largest(root.right);
			
		return Math.max(root.data, Math.max(left, right));
	}

	public static int numNodesGreaterX(BinaryTreeNode<Integer> root, int n) {
		
		if(root==null)
			return 0;
		
		if(root.data > n)
			return 1 + numNodesGreaterX(root.left, n)+numNodesGreaterX(root.right, n);
		else
			return numNodesGreaterX(root.left, n)+numNodesGreaterX(root.right, n);
	}

	public static int height(BinaryTreeNode<Integer> root) {
		
		if(root==null)
			return 0;
		
		int left = height(root.left);
		int right = height(root.right);
		
		return 1+Math.max(left, right);
	}

	public static int leafNode(BinaryTreeNode<Integer> root) {  
		
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 1;
		
		return leafNode(root.left)+leafNode(root.right);
	}

	public static void printDepth(BinaryTreeNode<Integer> root, int K) {
		
		if(root==null)
			return;
		
		if(K==0)
		{
			System.out.print(root.data+" ");
			return;
		}
		
		printDepth(root.left, K-1);
		printDepth(root.right, K-1);
		
	}
	

	public static void replaceDepth(BinaryTreeNode<Integer> root,int temp) {
		
		if(root==null)
			return;
		
		replaceDepth(root.left,temp+1);
		System.out.println(temp);
		
		replaceDepth(root.right,temp+1);
		
	}

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		
		if(root==null)
			return false;
		
		if(root.data == x)
			return true;
		
		return isNodePresent(root.left, x) || isNodePresent(root.right, x);
		
	}
}
