

public class Mirror {

	public static BinaryTreeNode<Integer> mirror(BinaryTreeNode<Integer> root) {
		
		if(root==null)
			return null;
		
		BinaryTreeNode<Integer> left = mirror(root.left);
		BinaryTreeNode<Integer> right = mirror(root.right);
		
		root.left = right;
		root.right = left;
		
		return root; 
	}

}
