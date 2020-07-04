
public class Solution {

	public static BinaryTreeNode<Integer> constructBST(int[] preorder) {
		
		return constructBST(preorder,0,preorder.length-1);
	}

	private static BinaryTreeNode<Integer> constructBST(int[] preorder, int start,int end) {

		if(preorder.length - 1 >= end)
			if(start > end)
				return null;

		int mid=(start+1 - end)/2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preorder[start]);

		root.left	=	constructBST(preorder, start+1, mid-1);
		root.right	=	constructBST(preorder, mid, end);

		return root;
	}
	
	

}
