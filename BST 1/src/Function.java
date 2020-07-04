
public class Function {
	
	static int sum =0;
	
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root, int sum) {
		
		if(root==null)
			return;
		
		replaceWithLargerNodesSum(root.right, sum );
		
		sum = sum+root.data;
		root.data =sum;
		replaceWithLargerNodesSum(root.left, sum);
		
	}

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		replaceWithLargerNodesSum(root,sum);
	}

}
