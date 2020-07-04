import java.util.ArrayList;

public class Path {

	public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data) {
		
		if(root==null)
			return null;
		
		if(data == root.data)
		{
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(data);
			return arr;
		}
		
		if(data < root.data && root.left != null)
		{
			ArrayList<Integer> arr = findPath(root.left, data);
			arr.add(root.data);
			return arr;
		}
		 if(data > root.data)
		 {
			 ArrayList<Integer> arr = findPath(root.right, data);
			 arr.add(root.data);
			 return arr;
		 }
		
		 return null;
	}

}
