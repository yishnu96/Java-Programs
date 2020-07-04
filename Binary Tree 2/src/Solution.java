import java.util.LinkedList;
import java.util.Queue;
import java.lang.Math;
import java.lang.Math;

public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {

		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			BinaryTreeNode<Integer> temp = queue.remove();
			System.out.print(temp.data + ":");
			if(temp.left!=null)
			{
				System.out.print("L:"+temp.left.data+",");
				queue.add(temp.left);
			}
			else
				System.out.print("L:-1,");
			if(temp.right != null)
			{ 
				System.out.print("R:"+temp.right.data);
				queue.add(temp.right);
			}
			else
				System.out.print("R:-1,");
			System.out.println();
		}
		
		
	}

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in) {
		return getTreeFromPreorderAndInorder(pre, in , 0,pre.length-1,0,in.length-1);
	}

	private static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in,
							int stpre, int endpre, int stIn,int endIn) 
	{
		if(stpre > endpre)
			return null;
		
		int temp = pre[stpre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(temp);
		
		for(int i=stIn;i<=endIn;i++)
			if(in[i] == temp)
				temp=i;
		
		int stpreLeft	= stpre+1;
		int stInLeft	= stpre;
		int endInLeft	= temp-1;
		int stInright	= temp+1;
		int endpreRight	= endpre;
		int endInRight	= endIn;
		
		int lengthLeft	= endInLeft-stInLeft+1;
		
		int endpreLeft	= stpreLeft+lengthLeft -1;
		int stpreRight	= endpreLeft+1;
		
		BinaryTreeNode<Integer> left = getTreeFromPreorderAndInorder(pre, in, stpreLeft, endpreLeft, stInLeft, endInLeft);
		BinaryTreeNode<Integer> right = getTreeFromPreorderAndInorder(pre, in, stpreRight, endpreRight, stInright, endInRight);
		
		root.left = left;
		root.right = right;
		
		return root;
	}

	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] pre, int[] in) {
		return getTreeFromPostorderAndInorder(pre, in, 0, pre.length-1, 0, in.length-1);
	}

	private static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post, int[] in,
													int stPost, int endPost, int stIn, int endIn) 
	{
		
		if(stPost > endPost)
			return null;
		
		int temp = post[endPost];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(temp);
		
		for(int i = stIn;i<=endIn;i++)
			if(temp == in[i])
			{
				temp=i;
				break;
			}
		
		int startInLeft		= stIn;
		int startPostLeft	= stPost;
		int endInLeft		= temp-1;
		int startInRight	= temp+1;
		int endInRight		= endIn;
		int endPostRight	= endPost-1;
		
		int length = endInLeft - startInLeft;
		int endPostLeft		= stPost + length;
		int startPostRight	= endPostLeft+1;
		BinaryTreeNode<Integer> left = getTreeFromPostorderAndInorder(post, in, startPostLeft, endPostLeft, startInLeft, endInLeft);
		BinaryTreeNode<Integer> right = getTreeFromPostorderAndInorder(post, in, startPostRight, endPostRight, startInRight, endInRight);
		
		root.left=left;
		root.right = right;
		return root;
	}

	public static PairAns minMax(BinaryTreeNode<Integer> root) {
		
		if(root==null)
		{
			PairAns ans=new PairAns();
			ans.max=Integer.MIN_VALUE;
			ans.min=Integer.MAX_VALUE;
			return ans;
		}

		PairAns left = minMax(root.left);
		PairAns right = minMax(root.right);


		int max = Math.max(root.data, Math.max(left.max, right.max));
		int min = Math.min(root.data, Math.max(left.min, right.min));
		

		PairAns ans = new PairAns();
		ans.max = max;
		ans.min = min;

		return ans;
	}

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String output) {
		
		if(root==null)
			return;
				
		
		
		output=output + (String) (root.data+" ");
		
		rootToLeafPathsSumToK(root.left, k - root.data, output);
		rootToLeafPathsSumToK(root.right, k - root.data, output);
		System.out.println("------"+output+"--- k="+k);
		
		if(root.data==k)
			System.out.println(output);
		
	}

	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int target, int k) {
		int length = length(root, target) - 1;
		Scaning(root, target, length, k);
	}
	
	public static void print(BinaryTreeNode<Integer> root, int tgtnode, BinaryTreeNode<Integer> pre, int k, boolean dwn) {
		
		if (root != null) {
			if (k == 0 && root.data != tgtnode) {
				System.out.println(root.data);
			}
			if (dwn) 
			{
				print(root.left, tgtnode, pre, --k, dwn);
				print(root.right, tgtnode, pre, k, dwn);
			} 
			else 
			{
				if (root.left != pre) 
					print(root.left, tgtnode, pre, --k, dwn);
				
				if (root.right != pre) 
					print(root.right, tgtnode, pre, --k, dwn);
			}
		}
	}

	public static BinaryTreeNode<Integer> Scaning(BinaryTreeNode<Integer> root, int dest, int k, int n) {
		
		if (root == null)
			return null;
		
		BinaryTreeNode<Integer> x = null;
		
		
		if (root.data == dest || (x = Scaning(root.left, dest, k - 1, n)) != null || (x = Scaning(root.right, dest, k - 1, n)) != null) 
		{
			if (k == 0) 
				print(root, dest, x, n - k, true);
			else 
				print(root, dest, x, n - k, false);

			return root;
		}
		return null;
	}

	public static int length(BinaryTreeNode<Integer> root, int n1) {
		if (root != null) 
		{
			int x = 0;
			if ((root.data == n1) || (x = length(root.left, n1)) > 0 || (x = length(root.right, n1)) > 0) 
				return x + 1;
			return 0;
		}
		return 0;
	}

}
























