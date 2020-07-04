//import java.lang.Math;
//public class Balance {
//
//	public static returnBalance checkBalance(BinaryTreeNode<Integer> root) {
//		
//		if(root==null)
//		{
//			returnBalance ans=new returnBalance();
//			ans.balance=true;
//			ans.hight=0;
//		}
//		
//		returnBalance left=checkBalance(root.left);
//		returnBalance right=checkBalance(root.right);
//		int hight=1+Math.max(left.hight, right.hight);
//		boolean bal=true;
//		
//		if(Math.abs(left.hight-right.hight)>1)
//			bal = false;
//		
//		if(!left.balance || !right.balance)
//			bal = false;
//		
//		returnBalance ans=new returnBalance();
//		ans.balance=bal;
//		ans.hight=hight;
//		
//		return ans;
//	}
//
////	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
////
////		if(root == null)
////			return 0;
////		
////		int optn1 = height(root.left)+height(root.right);
////		int optn2 = diameterOfBinaryTree(root.left);
////		int optn3 = diameterOfBinaryTree(root.right);
////		
////		return Math.max(1+optn1, Math.max(optn2, optn3));
////	}
//
////	public static int height(BinaryTreeNode<Integer> root) {
////		
////		 if(root==null)
////				return 0;
////			
////			int left = height(root.left);
////			int right = height(root.right);
////			
////			return 1+Math.max(left, right);
////	}
//	
//	
//
//	public static BT diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
//		
//		if(root==null)
//		{
//			BT ans=new BT();
//			ans.diameter=0;
//			ans.hight=0;
//			return ans;
//		}
//		
//		BT left = diameterOfBinaryTree(root.left);
//		BT right = diameterOfBinaryTree(root.right);
//		
//		int hight = 1 + Math.max(left.hight, right.hight);
//		int diameter = Math.max(left.hight+right.hight+1, Math.max(left.diameter, right.diameter));
//		
//		BT ans=new BT();
//		ans.hight=hight;	ans.diameter=diameter;
//		
//		return ans;
//
//	}
//	
//	
//
//	
//}
//
//class BT {
//	int hight;
//	int diameter;
//}
//
//
//class returnBalance {
//	int hight;
//	boolean balance;
//}